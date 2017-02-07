package com.imooc.ioc.interfaces;

public class Main {

	public static void main(String[] args) {
		OneInterface ofi = new OneInterfaceImpl();
		System.out.println(ofi.hello("word"));

	}

}
