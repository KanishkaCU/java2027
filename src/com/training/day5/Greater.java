package com.training.day5;

public class Greater {

	public static void main(String[] args) {
		
		int a=10, b=15, c=8, d=20;
		
		if (a>b && a>c && a>d) {
			System.out.println(a);
		}
		else {
			if (b>c && b>d) {
				System.out.println(b);
			}
			else {
				if (c>d) {
					System.out.println(c);
				}
				else {
					System.out.println(d);
				}
			}
		}

	}

}
