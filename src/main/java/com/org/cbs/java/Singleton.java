package com.org.cbs.java;

public class Singleton {
	// 单例 类的实例
	private static Singleton sinleton;

	// 隐藏构造器
	private Singleton() {

	}

	// 调用方法，并且保证只能创建一个实例
	public static Singleton getInstance() {
		if (sinleton == null) {
			sinleton = new Singleton();
		}
		return sinleton;
	}

}
