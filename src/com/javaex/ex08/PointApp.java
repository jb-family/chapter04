package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		/*
		Point p1 = new Point(1,3);	
		Point p2 = new Point(1,3);
		// equals메소드에서 p1의 값과 p2의 값이 같냐고 물어보는것
		// p1은 Point class에서 this.x this.y 이고 p2는 Object를 상속받아 (Point)로 다운캐스팅해서 p2의 p.x p.y를 말함
		// == 연산자는 기본자료형의 경우 값을 비교할때에 사용됨 기본자료형 외에는 주소값을 비교함
		// 즉 equals()오버라이딩 해서 p1의 x와y의 값이 p2의 x와 y값이 같냐고 물어보는 것
		System.out.println(p1.equals(p2)); 
		*/
		
		Point p1 = new Point(1,2);  //3
		Point p2 = new Point(3,6);  //9
		Point p3 = new Point(5,10); //15
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		
		
		System.out.println(pSet.size());
		System.out.println(pSet.toString());
		System.out.println("=====================");
		
		/*
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		*/
		
		
		Point p4 = new Point(2,7);  //9
		pSet.add(p4);	//p2 중복
		System.out.println(pSet.toString());
		System.out.println("=====================");
		
		
		//hashCode 출력
		
		for( Point p : pSet) {
			System.out.println(p.hashCode());
			
			
		}		
		
		
		
		
	}
}
