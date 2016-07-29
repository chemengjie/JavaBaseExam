package com.hand;

import java.util.Scanner;

public class gongzi {
	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner sc = new Scanner(System.in);
		float n = sc.nextInt();
		float m = n;
		System.out.println("所需要缴纳的税费为：");
		if(n<5000&&n>=3500){
			m = m*3/100;
			System.out.print(m);
		}
		if(n>=5000&&n<8000){
			m = m/10;
			System.out.print(m);
		}
		if(n<12500&&n>=8000){
			m = m*20/100;
			System.out.print(m);
		}
		if(n<38500&&n>=12500){
			m = m*25/100;
			System.out.print(m);
		}
		if(n<58500&&n>=38500){
			m = m*30/100;
			System.out.print(m);
		}
		if(n<83500&&n>=58500){
			m = m*35/100;
			System.out.print(m);
		}
		if (n>=83500) {
			m = m*45/100;
			System.out.print(m);
		}
	}
}
