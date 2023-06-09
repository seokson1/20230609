package com.yedam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// 1. ArrayList<T>
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Hello"); // 인덱스 값으로 저장하기 때문에 중복값이 들어감.

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------");

		// 2. Set<T> 중복값 받지 못함. -- 중복값 저장하지 않음.
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("---------------------");

		Set<Member> members = new HashSet<>();
		members.add(new Member("user1", "1111"));
		members.add(new Member("user2", "2222"));
		members.add(new Member("user1", "1111"));

		for (Member member : members) {
			System.out.println(member.getId() + ", " + member.getPw());
		}
	}
}
