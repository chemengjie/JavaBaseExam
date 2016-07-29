package com.hand;

public class sushu {
	public static void main(String[] args) {
		int count;
		int m=0;
		int n=0;
		int arr[]=new int[21];
		for (int i = 101; i <=200; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				
				if(i%j == 0){
					count++;
				}

			}
			if(count==2){
				m++;
				arr[n]=i;
				n++;
			}
		}
		System.out.print("101-200之间总共有"+m+"个素数，分别是：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
