package com.patterns;
import java.util.*;

	public class Pattern2 {

	    public static void main(String[] args) {
	    
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i,j,a;
	        if(n%2==0){
	            a=n/2;
	            for(i =1;i<=a;i++){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	                for(j=a;j>=1;j--){
	                    if(i==j){
	                        System.out.print("*");
	                    }
	                    else{
	                        System.out.print(" ");
	                    }
	            }
	                System.out.println(" ");
	            }
	            for(i=a-1;i>=1;i--){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	                 for(j=a;j>=1;j--){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	               System.out.println(" "); 
	                
	            }
	        }
	        else{
	            a=n/2;
	             for(i =1;i<=a+1;i++){
	                for(j=1;j<=a+1;j++){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	                for(j=a;j>=1;j--){
	                    if(i==j){
	                        System.out.print("*");
	                    }
	                    else{
	                        System.out.print(" ");
	                    }
	            }
	                System.out.println(" ");
	            }
	             for(i=a;i>=1;i--){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	                 for(j=a+1;j>=1;j--){
	                    if(i==j)
	                        System.out.print("*");
	                    else
	                        System.out.print(" ");
	                }
	               System.out.println(" "); 
	                
	            }
	            
	        }
	        
	    }
	}

