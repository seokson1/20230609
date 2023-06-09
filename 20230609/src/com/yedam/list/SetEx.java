package com.yedam.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello"); // String => hashcode. equlas 재정의 되어 있음.
		System.out.println(set);

		Iterator<String> iter = set.iterator(); // 반복자 지정.
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("-----------");
		for (String str : set) {
			System.out.println(str);
		}
		// 중복된 값 제거.
		Set<Integer> iSet = new HashSet<>();
		iSet.add(100);
		iSet.add(200);
		iSet.add(100);
		System.out.println("-----------");
		for (Integer str : iSet) {
			System.out.println(str);
		}
		System.out.println("-------------------");
		// 정수[] 선언 임의 값을 저장 (1 ~ 10) : 5개 저장.
		int[] numbers = new int[5];

		int result = 0;
		Set<Integer> set1;
		set1 = new HashSet<>();
		while (set1.size() < 5) {
			set1.add((int) ((Math.random() * 10) + 1));
		}
		
		for (int num : set1) {
			System.out.println(num);
		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

	}
}
