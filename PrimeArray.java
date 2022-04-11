package com.bridglabz.oops.ds.LinkedByGen;

import java.util.Scanner;

public class PrimeArray {
	int i;
	static int count;
	//public static void Prime() {
		
		//}
	
	public static void main(String[] args) {
		System.out.println("Enter the Maximum Number to are");
		Scanner Sc = new Scanner(System.in);
		//System.out.println("Enter the Maximum Number ");
		int n1 =(int) Sc.nextInt();
		System.out.println(" The Number Between 1 to "+n1+"are");
		for (int i=1;i<=100;i++) {
			count=1;
			for (int j=1;j<=100;j++) {
				count++;
			}
			System.out.print(i+ " ");
		}
		
		System.out.println("Enter the Number of Maximum Prime value ");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number of Maximum Prime value ");
		int n =scanner.nextInt();
		System.out.println("Enter the Prime number  between 1 to "+n+"are");
		for(int i=2;i<=100;i++) {
			count=0;
			
			for (int j=1;j<=100;j++) {
				if (i%j==0) {
					count++;
					
				}
			}
			if (count==2) 
				System.out.print(i+ " ");
				
			}
			
		}
		
	}

