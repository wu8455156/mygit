package com.alongwu;

public class Order {
	
	public Order(){
		System.out.println("���캯��");
	}
	
	static{
		System.out.println("��̬�����");
	}
	
	{
		System.out.println("�Ǿ�̬�����");
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		Order order2 = new Order();
	}
}
