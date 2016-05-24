package com.org.cbs.model;

public class Student {

	private String fid;

	private String name;

	private int num;

	private String mail;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Student [fid=" + fid + ", name=" + name + ", num=" + num + ", mail=" + mail + "]";
	}

}
