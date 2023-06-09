package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getTime()); // 1970년 1월 1일 0시 0분
		// 53년 6월 9일 * 24*60*60*1000

		long curr = 1686283272900L / (24 * 60 * 60 * 1000);
		System.out.println(today.toString());
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = simple.format(today);
		result = "2022/01/01 13:20:22";
		try {
			Date resultDate = simple.parse(result);
			System.out.println(resultDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);

		System.out.println(curr);

		result = dateToStr(today, "yyyy/MM/dd");
		System.out.println(result);
	}

	public static String dateToStr(Date date, String pattern) {
		// 처리.
		
		return null;
	}
}
