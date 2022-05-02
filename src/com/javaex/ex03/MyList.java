package com.javaex.ex03;


	public class MyList<T> {	
		//제네릭문법사용 제네릭은 Object랑 비슷한 성격을지녔지만 Object는 아니다.
		//데이터의 타입을 인스턴스를 생성할 때 확정한다. 
		//제네릭을 사용할 클래스를 불러올 때 어떤 클래스타입으로 받을지

		//필드
		private T[] oArray;	// 클래스 배열도 생성가능.
		private int crtPos;		// 다음에 추가해줄 방번호
		
		//생성자
		
		public MyList() {
			//배열 3개 --> 원래는 만들지않음.
			oArray = (T[])new Object[3];
			crtPos = 0;
		}
		
		//메소드 - gs
		
		//메소드 - 일반
		public void add(T obj) {
			//현재배열개수+1;
			//기존배열의 내용은 그대로 복사
			//마지막방에 point를 대입
			oArray[crtPos] = obj;
			crtPos++;
		}
		
		public int size() {
			
			return crtPos;
		}
		
		public T get(int index) {
			return oArray[index];
		}
		
		
		
		
				
				
	}

