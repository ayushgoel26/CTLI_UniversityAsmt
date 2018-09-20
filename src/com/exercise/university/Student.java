package com.exercise.university;

public class Student {
	private String studName;
	private String studID;
	private double mark1; // doble
	private double mark2;
	private double mark3;
	private double avgMark;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studName, String studID, double mark1, double mark2, double mark3) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudID() {
		return studID;
	}

	public void setStudID(String studID) {
		this.studID = studID;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public double getMark3() {
		return mark3;
	}

	public void setMark3(double mark3) {
		this.mark3 = mark3;
	}

	public double calcStudAvg() {
		this.avgMark = (this.mark1 + this.mark2 + this.mark3) / 3;
		return avgMark;
	}

	public double getStudAvg() {
		avgMark = this.calcStudAvg();
		return avgMark;
	}

	@Override
	public String toString() {
		return "Student [\nstudName=" + studName + ", \nstudID=" + studID + ", \nmark1=" + mark1 + ", \nmark2=" + mark2
				+ ", \nmark3=" + mark3 + "]";
	}

}
