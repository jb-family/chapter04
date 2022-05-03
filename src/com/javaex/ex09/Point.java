package com.javaex.ex09;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//메소드 - gs
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 - 일반
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
	
	public int hashCode() {
		int hashCode = this.x + this.y;
		return hashCode;
	}
	
	public boolean equals (Object obj) {
		boolean result;
		 Point p = (Point) obj;
		 
		 if(this.x == p.x && this.y == p.y) {
			 result = true;
		 }else {
			 result = false;
		 }
		 return result;		//return이 나오면 바로 종료됨. 그래서 변수에 값을 넣어놓음.
		 
	}
	
	
	
	
	
}
