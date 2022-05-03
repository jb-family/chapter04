package com.javaex.ex06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		//iset을 만든다
		Set<Integer> iSet = new HashSet<Integer>();
		
		//반복한다.(iset의 개수가 6개일때까지)
		while(iSet.size() <6) {
			
			//번호를 생성한다.
			int num = (int)(Math.random() * 45) + 1;
			
			//set에 add한다.
			iSet.add(num);
			
		}
		
		//출력한다.
	
		for(Integer num : iSet) {
			System.out.print(num + " ");
		}
		
		
	}

}
