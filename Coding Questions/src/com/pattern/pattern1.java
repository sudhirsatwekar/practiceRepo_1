package com.pattern;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println(" ");
//		}
		int o=1;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				//System.out.print("*");
				System.out.print((o++)+" ");
				
				
			}
			
			System.out.println("");
		}
		
		
		
		
		
	}

}
