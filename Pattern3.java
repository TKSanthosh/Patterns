package com.patterns;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 3;
		
		for(int i=0;i<n;i++) {
			
			int temp =n;
			for(int j=3;j>0;j--) {
			
				for(int k=n;k>=j;k--) {
					System.out.print(temp);
				}
				temp--;
				
			}
			System.out.println(" ");
		}
	}

}
