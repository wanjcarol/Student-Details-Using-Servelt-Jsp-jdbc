package com.learning;
public class Boys {
	private int aid;
	private String aname;
	private String tech;
	public Boys()
	{
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Boys [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
}
