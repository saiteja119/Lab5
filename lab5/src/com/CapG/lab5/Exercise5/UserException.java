package com.CapG.lab5.Exercise5;

class AgeException extends Exception
{
	int ageno;
	AgeException(int age)
	{
		ageno=age;
	}
	AgeException(String str)
	{
		super(str);
	}
	public String toString()
	{
		return "AgeException["+ageno+"]";
	}
}
public class UserException {
	static void AgeOfPerson(int age) throws AgeException
	{
		 if (age<18)
			throw new AgeException(age);
	     System.out.println("Normal Exit");
	}
	public static void main(String[] args) {
		try {
			AgeOfPerson(12);
			AgeOfPerson(20);
		}
		catch(AgeException a)
		{
			System.out.println("caught:"+a);
		}
	}
}