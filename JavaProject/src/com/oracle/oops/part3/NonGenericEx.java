package com.oracle.oops.part3;

public class NonGenericEx {
public static void main(String[] args) {
	Data data=new Data();
	data.setObj("Today is Tuesday");
	
	Data data2=new Data();
	data2.setObj(9999);
	
	String s=(String) data.getObj();
	System.out.println(s);
	
	int val=(Integer)data2.getObj();
	System.out.println(val);
	
	
	String s2=(String) data2.getObj();
	System.out.println(s2);
}
}


class Data{
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}