package com.training.day9;
import java.util.*;
public class arr {

	public static void main(String[] args) {
		
		
//		1 2 3 4 5 
		
//		int [] arr=new int[] {1,2,3,4,5};
//		int n=arr.length;
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
		
//		sum
		
//		int [] arr=new int[] {1,2,3,4,5};
//		int n=arr.length;
//		int sum = 0;
//		for(int i=0;i<arr.length;i++)
//			sum=sum+arr[i];
//			System.out.print(sum+" ");
			
		
		//even sum
		
//			int [] arr=new int[] {1,2,3,4,5};
//			int n=arr.length;
//			int sum = 0;
//			for(int i=0;i<arr.length;i++)
//				if(i%2==0) {
//				sum=sum+arr[i];
//				}
//				System.out.print(sum+" ");
		
		
//		prime 
		int[] arr = {11, 2, 3, 14, 57};

		for (int i = 0; i < arr.length; i++) {

		    int flag = 0;


		    for (int j = 2; j <= arr[i] / 2; j++) {
		        if (arr[i] % j == 0) {
		            flag = 1;
		            break;
		        }
		    }

		    if (flag == 0) {
		        System.out.println(arr[i]);
		    }
		}

				
				}}


