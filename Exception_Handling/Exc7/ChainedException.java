package com.yash.exc7;

public class ChainedException {
	
	static void chained() 
	{
		ArithmeticException a = new ArithmeticException();
		StringIndexOutOfBoundsException b = new StringIndexOutOfBoundsException();
		ArrayStoreException c = new ArrayStoreException();

		Throwable t1 = b.initCause(a);

		Throwable t2 = c.initCause(b);

		System.out.println(b.getCause() + " caused \n" + b);
		System.out.println(c.getCause() + " caused \n" + c);
	}

	public static void main(String[] args) {
		chained();
	}
}
