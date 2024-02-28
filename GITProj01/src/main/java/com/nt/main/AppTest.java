package com.nt.main;

import com.nt.service.ArithmeticOperation;

public class AppTest {

	public static void main(String[] args) {
		
		ArithmeticOperation ar= new ArithmeticOperation();
		System.out.println("Sum:: "+ar.sum(300, 100));
		System.out.println("Sub:: "+ar.sub(300, 100));
		
	}
	
}
