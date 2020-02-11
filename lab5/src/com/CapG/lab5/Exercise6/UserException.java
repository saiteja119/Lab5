package com.CapG.lab5.Exercise6;

class SalException extends Exception
{
	int emsal;
	SalException(int sal)
	{
		emsal = sal; 
	}
	SalException(String str)
	{
		super(str);
	}
	public String toString()
	{
		return "SalaryException["+emsal+"]";
	}
}
public class UserException {
	static void empsal(int sal) throws SalException
	{
		if(sal<3000)
			throw new SalException("invalid sal");
		System.out.println("Normal Exit");
	}
	public static void main(String[] args) {
		try {
			empsal(30000);
			empsal(2000);
		}
		catch(SalException a)
		{
			System.out.println("caught:"+a);
		}
	}
}

