package com.ymd.learn.model;

public class Teacher {

	private int id;
	private String name;
	private Classes classes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", classes=" + classes + "]";
	}
}
