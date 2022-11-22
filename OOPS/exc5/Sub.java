package com.yash.exc5;

public abstract class Sub extends Sum{
	 @Override
	    void sub(int a, int b) {
	        int sub = b-a;
	        System.out.println("sub : "+sub);
	    }
}
