package com.CapG.lab5.Exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RecursiveFibbo rf = new RecursiveFibbo();
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		//rf.fibo(num);
		System.out.println(rf.recursive(num));
	}
}
