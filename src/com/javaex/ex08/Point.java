package com.javaex.ex08;

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
	//hashCode가 중복이면 equals에서 다시한번 검사한다.
	//HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 
	//해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 
	//같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 
	//true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다. 
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
