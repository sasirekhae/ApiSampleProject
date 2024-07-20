package com.pojo;

public class pojoEx {
	int i=10;   //select this line & Rightclick,will take the get and set method from source.

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	public static void main(String[] args) {
		pojoEx p=new pojoEx();
		System.out.println(p.getI());
		p.setI(20);
		System.out.println(p.getI());
	}
	
	
	

}
