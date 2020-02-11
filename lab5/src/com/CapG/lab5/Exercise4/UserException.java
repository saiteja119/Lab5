package com.CapG.lab5.Exercise4;

class BlankException extends Exception
{
	BlankException(String str)
	{
		super(str);
	}
}
public class UserException{
	static void blname(String fn,String ln) throws BlankException
	{
		if(fn.length() == 0 && ln.length() == 0)
		{
			throw new BlankException("invalid name");
		}
	}
	public static void main(String[] args) {
		try {
			blname("sai","teja");
			blname("","");
		}
		catch(BlankException a)
		{
			System.out.println("caught:"+a);
		}
	}
}