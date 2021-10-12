package com.gitTest;

import java.util.Scanner;

public class 집가고싶은피카츄 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("집에 보내주시겠습니까? yes>> no>>");
		
		String answer = sc.next();
		
		if(answer.equals ("yes")) {
			System.out.println("피카츄는 집에 갔습니다");
		}else {
			System.out.println("복수하겠다");
		}
		
		

	}

}
