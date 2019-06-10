package cn.transfer_obj.pattern.simple;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	//列表是当作一个数据库
	List<StudentVo> students;
	
	public StudentBO() {
		students = new ArrayList<StudentVo>();
		StudentVo student1 = new StudentVo("Robert", 0);
		StudentVo student2 = new StudentVo("John", 1);
		
		students.add(student1);
		students.add(student2);
	}
	
	
	public void deleteStudent(StudentVo student) {
		students.remove(student.getRollNo());
		System.out.println("Student:Roll No "+student.getRollNo()+",deleted from database");
	}
	
	//从数据库中检索学生名单
	public List<StudentVo> getAllStudents(){
		return students;
	}
	
	public StudentVo getStudent(int rollNo) {
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentVo student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Role No "+student.getRollNo()+", update in the database");
	}

}
