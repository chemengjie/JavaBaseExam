package com.hand;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class random {
	public static void main(String[] args) {
		int arr[]= new int[50];
		int arr1[] = new int[50];
		System.out.print("�������50��С��100�������ֱ�Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.print("Map�е�����Ϊ��");
		for (int j = 0; j < arr1.length; j++) {
			arr1[j]=arr[j]/10;
			System.out.print(arr1[j]+",");
		}
		System.out.println();
		System.out.print("������MapΪ��");
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if (arr1[i]<arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		
	}
}
