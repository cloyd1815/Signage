package me.cloyd1815.signage.sign;

public class Sign {

	public static void make(String brandText, String sizeText, String priceText, String upcText, SignType signType) {
		//apche poi stuff here
		System.out.println(brandText + " " + sizeText + " " + priceText + " " + upcText + " " + signType.toString());
	}
	
	public static void make(String brandText, String sizeText, String priceText, SignType signType) {
		//apche poi stuff here
		System.out.println(brandText + " " + sizeText + " " + priceText + " " + signType.toString());
	}
}
