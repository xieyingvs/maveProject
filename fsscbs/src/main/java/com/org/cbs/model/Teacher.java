package com.org.cbs.model;

public class Teacher {

	private String tNo;

	private String name;

	private String age;

	private String mail;

	private String txt;

	public String gettNo() {
		return tNo;
	}

	public void settNo(String tNo) {
		this.tNo = tNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public String toString() {
		return "Teacher [tNo=" + tNo + ", name=" + name + ", age=" + age + ", mail=" + mail + ", txt=" + txt + "]";
	}

}
