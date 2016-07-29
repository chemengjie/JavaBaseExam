package com.hand;

import java.util.Scanner;

public class riqi {
	public static void main(String[] args) {
		System.out.println("请输入日期：");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String y = date.substring(0, 4);
		String m = date.substring(5,7);
		String d = date.substring(8, 10);
		int yy = Integer. parseInt(y);
		int mm = Integer.parseInt(m);
		int dd = Integer.parseInt(d);
		System.out.print("你输入的日期为当年的第");
		if(mm>2){
			if((yy%4==0 && yy%100!=0)||(yy%400==0)){
				switch (mm) {
				case 3:
					System.out.print(29+31+dd);
					break;
				case 4:
					System.out.print(31+29+31+dd);
					break;
				case 5:
					System.out.print(31+29+31+30+dd);
					break;
				case 6:
					System.out.print(31+29+31+30+31+dd);
					break;
				case 7:
					System.out.print(31+29+31+30+31+30+dd);
					break;
				case 8:
					System.out.print(31+29+31+30+31+30+31+dd);
					break;
				case 9:
					System.out.print(31+29+31+30+31+30+31+31+dd);
					break;
				case 10:
					System.out.print(31+29+31+30+31+30+31+31+30+dd);
					break;
				case 11:
					System.out.print(31+29+31+30+31+30+31+31+30+31+dd);
					break;
				default:
					System.out.print(31+29+31+30+31+30+31+31+30+31+30+dd);
					break;
				}
			}else{
				switch (mm) {
				case 3:
					System.out.print(28+31+dd);
					break;
				case 4:
					System.out.print(31+28+31+dd);
					break;
				case 5:
					System.out.print(31+28+31+30+dd);
					break;
				case 6:
					System.out.print(31+28+31+30+31+dd);
					break;
				case 7:
					System.out.print(31+28+31+30+31+30+dd);
					break;
				case 8:
					System.out.print(31+28+31+30+31+30+31+dd);
					break;
				case 9:
					System.out.print(31+28+31+30+31+30+31+31+dd);
					break;
				case 10:
					System.out.print(31+28+31+30+31+30+31+31+30+dd);
					break;
				case 11:
					System.out.print(31+28+31+30+31+30+31+31+30+31+dd);
					break;
				default:
					System.out.print(31+28+31+30+31+30+31+31+30+31+30+dd);
					break;
				}
			}
		}else{
			switch (mm) {
			case 1:
				System.out.print(dd);
				break;
			default:
				System.out.print(31+dd);
				break;
			}
		}
		System.out.print("天");


	}
}
