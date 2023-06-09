package com.yedam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypingSpeedEx {
	// 문장 출력 > 입력 : Unless > 문장 출력 > 일력: noted,
	// 완료: 완료메세지: 실행했던 80초 -> 1분 20초
	public static void main(String[] args) {
		String origin = "The String class represents";
		String[] arr = origin.split(" ");

		Scanner scr = new Scanner(System.in);
		boolean run = true;
		long start = System.currentTimeMillis();

		while (run) {
			int selectNo = 0;
			String result = "";
			System.out.println("1.문장출력 | 2.입력");
			selectNo = Integer.parseInt(scr.nextLine());
			if (selectNo == 1) {
				System.out.print("문장 출력 >");

				for (String str : arr) {
					result += str;
				}
				System.out.println(result);
				if (result == "") {
					System.out.println("문자가 없습니다.");
					run = false;
				}
			} else if (selectNo == 2) {
				System.out.print("입력> ");
				String delt = scr.nextLine();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].equals(delt)) {
						arr[i] = "";
					}
				}
			}

		}
		
		long end = System.currentTimeMillis();
		String delay = time(start, end);
		System.out.printf("%s 걸렸습니다.", delay);
	
	}
	public static String time(long start, long end) {
		long delay = (end - start) / 1000; 
		long mm = delay / 60;
		long ss = delay % 60;
		return mm + "분" + ss + "초";
	}
	
}
