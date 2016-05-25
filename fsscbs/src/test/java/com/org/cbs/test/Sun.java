package com.org.cbs.test;

public enum Sun {

	GREEN("1", "棕色"),

	YELLOW("2", "黄色"),

	RED("3", "红色"),

	BLACK("4", "黑色");

	private String index;
	private String name;

	private Sun(String index, String name) {
		this.index = index;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
