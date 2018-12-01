package com.app.infosys;

public class Addition {

	public  String addOfTwoNumbers(int a,int b) {
		
		return "result:"+a+b;
		
	}
	
	public static void main(String[] args) {


		Addition add=new Addition();
		String msg=add.addOfTwoNumbers(5, 6);
		System.out.println(msg);
		System.out.println("bg");
		
	}

}
