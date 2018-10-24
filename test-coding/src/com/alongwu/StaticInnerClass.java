package com.alongwu;

public class StaticInnerClass {
	private static class Singleton{
		private static final StaticInnerClass INSTANCE = new StaticInnerClass();
	}
	
	private StaticInnerClass(){
	}
	
	public static StaticInnerClass getInstance(){
		return Singleton.INSTANCE;
	}
}
