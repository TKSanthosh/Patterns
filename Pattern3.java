package com.patterns;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp,n = 3;
		temp =n;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {	
				for(int k=1;k<=i;k++) {
					System.out.print(j);
				}
			}
			
			System.out.print(" $ ");
		}
	}

}
