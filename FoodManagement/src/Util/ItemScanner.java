package Util;

import java.util.Scanner;

public class ItemScanner {
	Scanner monthScanner, dayScanner, hourScanner;
	int year, mon, day, hour;
	String month,days,hours;
	String name="hakhyun";
	public String scanAll() {
		year = 2019;
		System.out.println("����ΰ���");
		monthScanner = new Scanner(System.in);
		mon = monthScanner.nextInt();
		System.out.println("�����ΰ���");
		dayScanner = new Scanner(System.in);
		day = dayScanner.nextInt();
		System.out.println("����ΰ���");
		hourScanner = new Scanner(System.in);
		hour = hourScanner.nextInt();
		if(mon<10)  month= "0"+mon;
		if(day<10)  days= "0"+day; else days= new Integer(day).toString();
		if(hour<10)  hours= "0"+hour+":00:00";
		return "" + month +"/"+ days +"/"+year+" "+ hours;
	}

}
//"MM/dd/yyyy HH"