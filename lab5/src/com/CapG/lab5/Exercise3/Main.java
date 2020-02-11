package com.CapG.lab5.Exercise3;

import java.util.Scanner;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Prime p = new Prime();
		p.primenum(size);
	}
}
class Prime
{
	int size;
	int num=0;
	int i;
	void primenum(int size)
	{
		for(i=1;i<=size;i++)
		{
			int count=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num == 0)
				{
					count+=1;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
			}
		}
	}
}