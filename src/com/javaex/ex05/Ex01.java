package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// 제네릭에서 int의 기본자료형은 <Integer> 사용해주어야 한다.
		// HashSet 인스턴스생성하고 Set이라는 인터페이스로 (레퍼런스타입)주소를 연결함
		// HashSet은 지금 Set이 가지고있는 메소드() 제목만 볼수있는 상태. 하지만 iset이라는 참조변수는 int 값만 들어올수있음.
		Set<Integer> iset = new HashSet<Integer>();	
		
		// 되는이유는 박싱된것. 현재 iset은 Integer 타입만 들어갈수있음.
		// add() 메소드에 int로 변환되게 자동 박싱되는 기능이 있음.
		
		//iset.add(12);	 
		
		//Integer i01 = new Integer(4); 이렇게 안쓰고 아래처럼 쓰인다. Integer는 int로 자동으로 값 바뀜 
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		
		System.out.println(iset.size());
		System.out.println(iset.toString());//HashSet이 toString 재정의한것.  Set 인터페이스는 ()만 가지고 있음.
		
		System.out.println("=====================");
		for(Integer num : iset) {	//여기엔 향상된 for문을 무조건 사용해주어야한다. Integer num의 값을 iset에? 모두 출력해라 다시 정리하기.
			System.out.println(num.toString());//Integer의 toString 사용한것.
		}
		System.out.println("=====================");
		
		//중복 체크
		
		Integer i04 = 5;
		iset.add(i04);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
