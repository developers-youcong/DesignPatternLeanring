package cn.db_access_obj.pattern.simple;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudent();
	
	public Student getStudent(int rollNo);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);


}
