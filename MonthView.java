/***********
Ref: https://www.796t.com/content/1548315905.html
***********/

package monthview;

import java.util.Scanner;

public class MonthView {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		// int year = input.nextInt();
		// int month = input.nextInt();

		int years = 1901; // 閏年
		int months = 1;
		boolean result;
		int days;
		result = isLeapY(years);
		System.out.print("是否閏年: " + result + ", ");
		days = getDays(years, months);
		System.out.println(months + "月天數有" + days + "天");
		System.out.println("\n日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=31;i++) {
			System.out.print(i+"\t");		
			if(i%7==0) {
				System.out.println();
			}
		}
	//	System.out.println("已過"+sumDays(years)+"天");

	//	System.out.println(getNowDays(years,months));
	//	System.out.println(getWeekly(years,months));
		

	}

	
	static int getWeekly(int years,int months) {
		//1900--1--
		int currweek = 0;
		for(int i=1;i<=1;i++) {

		}
		return currweek;
	}
	
	// 計算1900至當年天數
	static int getNowDays(int years,int months) {
		int ctday = 0;
		for(int m=1;m<=years;m++) {
			ctday+=getDays(years,m);
		}
		
		return ctday;
	}
	

	// 計算1900至計算年天數總和
	static int sumDays(int years) {
		int sumdays = 0;
		for (int y = 1900; y < years; y++) {
			sumdays += isLeapY(y) ? 366 : 365;
		}
		return sumdays;
	}

	// 取得當年的月份天數
	static int getDays(int years, int months) {
		int days = 0;
		switch (months) {
		case 2:
			if (isLeapY(years)) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		}
		return days;
	}

	/*
	 * 判斷是否為閏年 
	 * if (years % 4 == 0) //必要條件!! 
	 * if (years % 100 != 0) 
	 * if (years % 400 == 0) //必要條件!!
	 */
	static boolean isLeapY(int y) {
		boolean isLeap = false;
		if (y % 4 == 0 && y % 400 == 0) {
			isLeap = true;
		} else if (y % 4 == 0 && y % 100 != 0) {
			isLeap = true;
		}
		return isLeap;
	}
}
