package com.yedam.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		// 키, 값
		Map<String, Integer> map;
		map = new HashMap<>();
		
		map.put("홍길동", 90);
		map.put("김민기", 88);
		map.put("김이수", 85);
		map.put("홍길동", 95);
		
		//map.remove("홍길동");
		
		// 조회.
		Integer result =  map.get("홍길동");
		System.out.println(result);
		
		Set<String> keys = map.keySet(); // 키 값을 담은 set 반환.
		// keySet 확인
		Iterator<String> itr =  keys.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Integer val = map.get(key);
			System.out.printf("키: %s, 값: %d \n", key, val);
		}
		
	}
}
