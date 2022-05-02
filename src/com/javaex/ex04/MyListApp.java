package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();
		
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		
		Point p04 = new Point(100, 101);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//pList.add(c01);	//원은 담을수없다.
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("===================");
		
		
		pList.remove(1);
		//pList.remove(p02);
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("===================");		
		
		System.out.println(pList.toString());	//Point toString() 헷갈리지않기.
		
		System.out.println("===================");
		
		//for문의 다른표현 --> 향상된 for문
		for(Point p : pList) {
		//Point 클래스의 p에다 넣어 pList를 다 돌려라라는 의미
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		System.out.println("===================");
		//p04를 2번째 (방번호 1번[1])째 추가
		//pList.add(p04);
		pList.add(1, p04);
		
		System.out.println(pList.toString());
		
		
		
	}

}
