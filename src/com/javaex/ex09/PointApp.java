package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {
		
		//Map은 넣을때 이름을 주고 넣는다. (보통 첫번째에는 별명(숫자로할건지문자로할건지), 두번째는 관리할 클래스 입력)
		//Map<String, Point> String은 key값 Point는 value임.
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(3, 3);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(14, 32);
		
		
		pMap.put("정우성", p01);	
		pMap.put("이효리", p02);	
		pMap.put("박명수", p03);	
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());

		//같은 키값으로 추가한경우 
		System.out.println(pMap.get("정우성").getX());
		Point p04 = new Point(100, 200);
		pMap.put("정우성", p04);
		System.out.println(pMap.toString());	// 기존 값이 바뀐다.
		
		//전체출력	(규칙이 없어서 좀 어렵다.) 전체출력을 하려면 키 목록을 만들어야한다.
		
		//1. 키 목록 생성 ["정우성", "이효리", "박명수"]
		//2. pMap.get("키값");으로 꺼내면 된다.
		
		Set<String> keys = pMap.keySet();	// key값들은 Set에서 관리하고있다. 중복제거
		System.out.println(keys.toString());// 
		
		
		for(String name : keys) {
			System.out.println(pMap.get(name).getX());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
