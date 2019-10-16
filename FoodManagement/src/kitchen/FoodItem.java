package kitchen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Util.ItemScanner;

public class FoodItem {
	private static long startDay;

	public static void main(String[] args) {
		ItemScanner itscan = new ItemScanner();
		String purchaseDate = itscan.scanAll();
		System.out.println(purchaseDate);
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(purchaseDate);
			startDay = d1.getTime();
			System.out.println(startDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long today = getToday();
		System.out.println("duration "+durationPeriod());
		presentation();
	}

	private static void presentation() {
		long presentationExpression = durationPeriod();
		long diffHours = presentationExpression / (60 * 60 * 1000) % 24;
		long diffDays = presentationExpression / (24 * 60 * 60 * 1000);
		System.out.println("The product is passed for "+diffHours+" hours and "+diffDays +" days!");
		
	}

	private static long durationPeriod() {
		
		
		return getToday() - startDay;

	}

	private static long getToday() {
		Date today = new Date();
		return today.getTime();

	}
	
	
}
