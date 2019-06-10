package cn.db_access_obj.pattern.simple;

public class DaoPatternDemo {

public static void main(String[] args) {
	
	StudentDao studentDao = new StudentDaoImpl();
	
	//输出所有学生
	for (Student student : studentDao.getAllStudent()) {
		System.out.println("Student:[RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
	}
	
	//更新学生
	Student student = studentDao.getAllStudent().get(0);
	student.setName("Michael");
	studentDao.updateStudent(student);;
	
	studentDao.getStudent(0);
	System.out.println("Student:[RollNo:"+student.getRollNo()+",Name:"+student.getName());
}

}
