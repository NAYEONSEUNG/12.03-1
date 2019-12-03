package chapter05;

import java.util.Scanner;

public class Pbnc2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		System.out.print("숫자를입력하세요:");
		int end = sc.nextInt();
		
		System.out.println("1");
		System.out.println("1");
		
		for(int i=2; i<end; i++) {
		
			sum = num1 + num2; //2
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			
			
			
		}//for
		
	}//main
}//class
