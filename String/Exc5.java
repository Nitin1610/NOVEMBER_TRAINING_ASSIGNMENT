package com.yash.stringexc;

public class Exc5 {
	public static void main(String[] args) {

		
		  int N = 77777777; long t;
		  
		  { StringBuffer sb = new StringBuffer(); t = System.currentTimeMillis(); for
		  (int i = N; i-- > 0;) { sb.append(""); }
		  System.out.println("String Buffer:-");
		  System.out.println(System.currentTimeMillis() - t); }
		  
		  { StringBuilder sb = new StringBuilder(); t = System.currentTimeMillis(); for
		  (int i = N; i > 0; i--) { sb.append(""); }
		  System.out.println("StringBuilder :-");
		  System.out.println(System.currentTimeMillis() - t); }
	}
}
		 
/*
		String withString = "";
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			withString += "some string";
		}
		System.out.println("strings:" + (System.currentTimeMillis() - t0));

		t0 = System.currentTimeMillis();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buf.append("some string");
		}
		System.out.println("Buffers : " + (System.currentTimeMillis() - t0));

		t0 = System.currentTimeMillis();
		StringBuilder building = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			building.append("some string");
		}
		System.out.println("Builder : " + (System.currentTimeMillis() - t0));
	}
}*/
