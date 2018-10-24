package com.alongwu;

public class Order {
	
	public Order(){
		System.out.println("构造函数");
	}
	
	static{
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("非静态代码块");
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		Order order2 = new Order();
	}
}
