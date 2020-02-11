package com.CapG.lab5.Exercise1;
import java.util.*;
public class MainTraffic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("->red");
		System.out.println("->yellow");
		System.out.println("->green"); 
		String str =sc.next();
		 switch(str)
		 {
		 case "red":
			 System.out.println("You are required to stop");
			 break;
		 case "yellow":
			 System.out.println("Wait for 2 minutes");
			 break;
		 case "green":
			 System.out.println("You can go now");
			 break;
		 }
	}
}
