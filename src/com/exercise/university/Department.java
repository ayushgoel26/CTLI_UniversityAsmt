package com.exercise.university;

import java.util.*;

public class Department {
	private String deptName;
	private int deptNo;
	private ArrayList<Student> studList;
	private double deptAvg;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, int deptNo, ArrayList<Student> studList) throws DeptNoInvalidException {
		super();
		if (deptNo < 101 || deptNo > 200) {
			throw new DeptNoInvalidException("Invalid Department No. Only dept no. 101 and 102 exist");
		} else {
			this.deptName = deptName;
		}
		this.deptNo = deptNo;
		this.studList = studList;
		this.calcDeptAvg();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public ArrayList<Student> getStudList() {
		return studList;
	}

	public void setStudList(ArrayList<Student> studList) {
		this.studList = studList;
	}

	public double calcDeptAvg() {
		double Avg = 0.0;
		for (Student student : studList) {
			Avg += student.getStudAvg();
		}
		this.deptAvg = Avg / studList.size();

		return this.deptAvg;
	}

	@Override
	public String toString() {
		return "Department [\ndeptName=" + deptName + ", \ndeptAvg = " + deptAvg + ", \ndeptNo=" + deptNo
				+ ", \nstudList=" + studList + "]";
	}

}
