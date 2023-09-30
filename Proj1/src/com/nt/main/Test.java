package com.nt.main;

import com.nt.dao.Pqr;
import com.nt.dao.Xyz;

public class Test {

	public static void main(String[] args) {
		Xyz xyz=new Xyz();
		int result=xyz.add(10, 20);
		System.out.println("Result ::"+result);
		
		Pqr pqr=new Pqr();
		pqr.message();
	}

}
