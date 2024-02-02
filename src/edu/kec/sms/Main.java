package edu.kec.sms;

import java.util.Scanner;

import edu.kec.sms.iservice.IStudentService;
import edu.kec.sms.model.Student;
import edu.kec.sms.service.StudentService;

public class Main {
	public static void main(String[] args) {
		IStudentService studentService = new StudentService();
		Student student = readStudent();
		if (studentService.add(student)) {
			System.out.println("Student added...");
		} else {
			System.out.println("Failed to add student...");
		}
		
		Student arryStudent = studentService.getStudentById(1);
		System.out.println(arryStudent.getName());
	}

	public static Student readStudent() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.print("enter name:");
		student.setName(scanner.nextLine());
		System.out.print("enter email:");
		student.setEmail(scanner.nextLine());
		System.out.print("enter id:");
		student.setId(scanner.nextInt());
		System.out.print("enter mobile:");
		student.setMobile(scanner.nextLong());
		scanner.close();
		return student;
	}
}