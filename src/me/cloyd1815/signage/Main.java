package me.cloyd1815.signage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Main extends JFrame {
	public final String TITLE = "Signage", VERSION = "0.0.0.0";
	/**
	 * 
	 */
	private static final long serialVersionUID = -8116777904769938714L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle(TITLE + " v. " + VERSION);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBrandName = new JLabel("Brand Name");
		lblBrandName.setBounds(10, 11, 80, 14);
		contentPane.add(lblBrandName);
		
		JTextArea brandText = new JTextArea();
		brandText.setBounds(10, 34, 414, 45);
		contentPane.add(brandText);
		
		JTextArea sizeText = new JTextArea();
		sizeText.setBounds(10, 108, 414, 45);
		contentPane.add(sizeText);
		
		JLabel lblSizeDescription = new JLabel("Size Description");
		lblSizeDescription.setBounds(10, 85, 80, 14);
		contentPane.add(lblSizeDescription);
		
		JTextArea priceText = new JTextArea();
		priceText.setBounds(10, 182, 414, 45);
		contentPane.add(priceText);
		
		JLabel lblPriceInfo = new JLabel("Price Info");
		lblPriceInfo.setBounds(10, 159, 80, 14);
		contentPane.add(lblPriceInfo);
		
		JTextArea upcText = new JTextArea();
		upcText.setBounds(10, 256, 414, 45);
		contentPane.add(upcText);
		
		JLabel lblUpcoptional = new JLabel("UPC (optional)");
		lblUpcoptional.setBounds(10, 233, 80, 14);
		contentPane.add(lblUpcoptional);
		
		JButton btnMake = new JButton("Make Signs");
		btnMake.setBounds(170, 435, 89, 23);
		contentPane.add(btnMake);
		
		JRadioButton rdbtnRegularPrice = new JRadioButton("Regular Price");
		rdbtnRegularPrice.setBounds(181, 308, 89, 23);
		contentPane.add(rdbtnRegularPrice);
		
		JRadioButton rdbtnSaveMore = new JRadioButton("Save More");
		rdbtnSaveMore.setBounds(99, 308, 80, 23);
		contentPane.add(rdbtnSaveMore);
		
		JRadioButton rdbtnWeeklySpecial = new JRadioButton("Weekly Special");
		rdbtnWeeklySpecial.setBounds(0, 308, 97, 23);
		contentPane.add(rdbtnWeeklySpecial);
		
		JCheckBox chckbxFullPage = new JCheckBox("Full Page");
		chckbxFullPage.setBounds(10, 348, 97, 23);
		contentPane.add(chckbxFullPage);
		
		JCheckBox chckbxHalfPage = new JCheckBox("Half Page");
		chckbxHalfPage.setBounds(109, 348, 97, 23);
		contentPane.add(chckbxHalfPage);
		
		JCheckBox chckbxQuarterPage = new JCheckBox("Quarter Page");
		chckbxQuarterPage.setBounds(208, 348, 97, 23);
		contentPane.add(chckbxQuarterPage);
		
		JRadioButton rdbtnFarmFresh = new JRadioButton("Farm Fresh");
		rdbtnFarmFresh.setBounds(272, 308, 89, 23);
		contentPane.add(rdbtnFarmFresh);
	}
}