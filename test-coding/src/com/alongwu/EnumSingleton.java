package com.alongwu;

public class EnumSingleton {
	private enum MyEnum{
		INSTANCE;
		private EnumSingleton enumSingleton;
		private MyEnum(){
			enumSingleton = new EnumSingleton();
		}
		public EnumSingleton getInstance(){
			return enumSingleton;
		}
	}
	
	private EnumSingleton(){}
	
	public static EnumSingleton getInstance(){
		return MyEnum.INSTANCE.getInstance();
	}
	
	public static void main(String[] args) {
		System.out.println(EnumSingleton.getInstance());
	}
}
