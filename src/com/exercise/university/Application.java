package com.exercise.university;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		try {
			ArrayList<Department> deptList = new ArrayList<Department>();
			University Dtu = new University("DTU", deptList) ; 
			deptList = Dtu.populateUniversity();
			int departmentNo;
			Scanner sc = new Scanner(System.in);
			boolean cont = true;
			do{
				System.out.print("Enter the Department No to display details: \n");
				departmentNo = Integer.parseInt(sc.nextLine());
				for (Department dept : deptList) {
					if (dept.getDeptNo() == departmentNo) {
						System.out.println(dept);
					}
				
				}
			}while(cont);
			sc.close();
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
