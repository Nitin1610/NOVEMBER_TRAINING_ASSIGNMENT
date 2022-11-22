package com.yash.exc9;

public class Test {

	public Test() {
		super();
        System.out.println("object is created"+this);
    }

    @Override
    public void finalize() {
        System.out.println("objcet is destructor"+this);
    }
}
