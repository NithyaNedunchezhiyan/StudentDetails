package com.org.constituency1;

public class Constituency {
	int cons_id;
	String cons_name;
	public Constituency(int cons_id, String cons_name) {
		super();
		this.cons_id = cons_id;
		this.cons_name = cons_name;
	}
	public int getCons_id() {
		return cons_id;
	}
	public void setCons_id(int cons_id) {
		this.cons_id = cons_id;
	}
	public String getCons_name() {
		return cons_name;
	}
	public void setCons_name(String cons_name) {
		this.cons_name = cons_name;
	}
	@Override
	public String toString() {
		return "Constituency [cons_id=" + cons_id + ", cons_name=" + cons_name + "]";
	}
}
