package com.yedam.ex;

public class TestString {
	public static void main(String[] args) {

		String str;
		str = "The class, String includes methods, for examining individual for examining individual for examining individual";
		String[] strs = str.split(",");
		int cnt = 0;
		for(String word : strs) {
			System.out.println(word);
			System.out.println(word.indexOf("for"));
			if(word.indexOf("for")== 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		String str1;
		String str2;
		str = "c:/temp/images/sample.jpg";
		str1 = str.substring(15, 21);
		str2 = str.substring(22);
		System.out.println("파일명: " + str1);
		System.out.println("확장명: " + str2);
		System.out.println("--------------------");

		String[] ssn = { "950102-1234567", "960405 2345678", "9703041234567", "0501013456789", "0604014545678",
				"250903-3234567" };

//		for (int i = 0; i < ssn.length; i++) {
//			ssn[i].replace("-", "");
//			ssn[i].replace(" ", "");
//			if (ssn[i].charAt(0) != '0' && ssn[i].charAt(7) == '3' || ssn[i].charAt(7) == '4') {
//				System.out.println("2000년 이전의 주민번호 7번째 자리가 3, 4 올수 없습니다.");
//			} else if (ssn[i].charAt(7) == '1' || ssn[i].charAt(7) == '3' && ssn[i].length()  == 13) {
//				System.out.println("남자입니다.");
//			} else if (ssn[i].charAt(7) == '2' || ssn[i].charAt(7) == '4' && ssn[i].length()  == 13) {
//				System.out.println("여자입니다.");
//			} else {
//				System.out.println("null");
//			}
//
//		}
		for (String st1 : ssn) {
			System.out.printf("주민번호: %3s 성별: %2s \n", st1, check(st1));
		}
//		
//		String result = check();
//		System.out.println(result);
	}

	public static String check(String str) {
		String gender = str;
		gender = gender.replace("-", "").replace(" ", "");
		char c = gender.charAt(6);
		if (gender.charAt(0) != '0' && (c == '3' || c == '4')) {
			return "2000년 이전의 주민번호 7번째 자리가 3, 4 올수 없습니다.";
		} else if ((c == '1' || c == '3') && gender.length() == 13) {
			return "남";
		} else if ((c == '2' || c == '4') && gender.length() == 13) {
			return "여";
		}
		return null;
	}
}
