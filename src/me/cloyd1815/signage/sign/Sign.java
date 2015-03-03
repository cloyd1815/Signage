package me.cloyd1815.signage.sign;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.CharacterRun;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Sign {

	public static void make(String brandText, String sizeText,
			String priceText, String upcText, SignType signType) {
		if (signType.equals(SignType.REGULAR_PRICE_HALF)) {
			String filePath = "HALF_PAGE_REG.doc";
			String tempfilePath = "HALF_PAGE_REG_TEMP.doc";
			File file = new File("HALF_PAGE_REG_TEMP.doc");
	        POIFSFileSystem fs = null;        
	        try {            
	            fs = new POIFSFileSystem(new FileInputStream(filePath));            
	            HWPFDocument doc = new HWPFDocument(fs);
	            doc = replaceText(doc, "%DESCRIPTION", brandText);
	            doc = replaceText(doc, "%SIZE", sizeText);
	            doc = replaceText(doc, "%PRICE", priceText);
	            doc = replaceText(doc, "%UPC", upcText);
	            saveWord(tempfilePath, doc);
	            java.awt.Desktop.getDesktop().edit(file);
	        }
	        catch(FileNotFoundException e){
	            e.printStackTrace();
	        }
	        catch(IOException e){
	            e.printStackTrace();
	        }
		}
	}

	public static void make(String brandText, String sizeText,
			String priceText, SignType signType) {

	}

	private static HWPFDocument replaceText(HWPFDocument doc, String findText,
			String replaceText) {
		Range r1 = doc.getRange();

		for (int i = 0; i < r1.numSections(); ++i) {
			Section s = r1.getSection(i);
			for (int x = 0; x < s.numParagraphs(); x++) {
				Paragraph p = s.getParagraph(x);
				for (int z = 0; z < p.numCharacterRuns(); z++) {
					CharacterRun run = p.getCharacterRun(z);
					String text = run.text();
					if (text.contains(findText)) {
						run.replaceText(findText, replaceText);
					}
				}
			}
		}
		return doc;
	}

	private static void saveWord(String filePath, HWPFDocument doc)
			throws FileNotFoundException, IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filePath);
			doc.write(out);
		} finally {
			out.close();
		}
	}
}
