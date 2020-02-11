package com.CapG.lab5.Exercise2;

public class RecursiveFibbo {
	int first =0;int second=1;
	int fibbo;
	int recursive(int num)
	{
		if(num>0)
		{
			fibbo=first+second;
			first=second;
			second=fibbo;
			recursive(num-1);
		}
		return second;
	}
	void fibo(int num)
	{
		if(num==0)
			System.out.println("0");
		for(int loop=0;loop<num;loop++)
		{
			fibbo=first+second;
			first=second;
			second=fibbo;
		}
		System.out.println(second);
	}
}
