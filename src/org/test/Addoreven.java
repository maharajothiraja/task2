package org.test;

import java.util.Scanner;

public class Addoreven {

	public static void main(String[] args) {
		while (true) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no");
	int  no= s.nextInt();
	int no2=no;
	int rem=0;
	while (no>0) {
		rem=(rem*10)+no%10;
		no=no/10;
	}
	System.out.println(rem);
	if (no2==rem) {
		System.out.println("no is palyndrome");

	} else {
		System.out.println("no is not palyndrome");

	}
		
		
		
	
		}
	}
}
	
