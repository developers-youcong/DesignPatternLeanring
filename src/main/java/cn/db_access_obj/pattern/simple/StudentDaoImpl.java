package cn.db_access_obj.pattern.simple;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	
	//列表是当作一个数据库
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		
		Student student1 = new Student("Robert",0);
		
		Student student2 = new Student("John",1);
		
		students.add(student1);
		students.add(student2);
	}

	public List<Student> getAllStudent() {
		
		return students;
	}

	public Student getStudent(int rollNo) {
		
		return students.get(rollNo);
	}

	public void updateStudent(Student student) {
		
		students.get(student.getRollNo()).setName(student.getName());
		
		System.out.println("Student:Roll No "+student.getRollNo()+",update in the database");
	}

	public void deleteStudent(Student student) {
		
		students.remove(student.getRollNo());
		
		System.out.println("Student: Roll No "+student.getRollNo()+",delete from database");
		
	}

}
