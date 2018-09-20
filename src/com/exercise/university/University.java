package com.exercise.university;

import java.util.*;

public class University {
	private String UnivName;
	private ArrayList<Department> deptList;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String univName, ArrayList<Department> deptList) {
		super();
		UnivName = univName;
		this.deptList = deptList;
	}

	public String getUnivName() {
		return UnivName;
	}

	public void setUnivName(String univName) {
		UnivName = univName;
	}

	public ArrayList<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(ArrayList<Department> deptList) {
		this.deptList = deptList;
	}

	public ArrayList<Department> populateUniversity() {

		ArrayList<Student> studentList1 = new ArrayList<>();
		ArrayList<Student> studentList2 = new ArrayList<>();
		ArrayList<Department> departmentList = this.deptList;

		Student student1 = new Student("S101", "Scott", 93, 92, 93);
		Student student2 = new Student("S102", "Micheal", 76, 98, 73);
		Student student3 = new Student("S103", "Steven", 56, 65, 69);
		Student student4 = new Student("S104", "Gregory", 65, 78, 83);

		studentList1.add(student1);
		studentList1.add(student2);
		studentList2.add(student3);
		studentList2.add(student4);

		Department electricalDept;
		try {
			electricalDept = new Department("Electrical Department", 101, studentList1);
			departmentList.add(electricalDept);

		} catch (DeptNoInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Department civilDept;
		try {
			civilDept = new Department("Civil Department", 102, studentList2);
			departmentList.add(civilDept);

		} catch (DeptNoInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return departmentList;

	}

}
