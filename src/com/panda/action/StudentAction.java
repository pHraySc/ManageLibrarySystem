package com.panda.action;

import com.opensymphony.xwork2.ActionSupport;
import com.panda.bean.Student;
import com.panda.daoImpl.StudentDaoImple;

/*
* @author MrC
* @date 2016年11月24日下午2:33:32
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class StudentAction extends ActionSupport {
	private Student student;//构造模型

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	//判断student对象是否为空
	public String addstudent() {
		System.out.println(student.getStu_Email());
		if (student==null) {
			return ERROR;
		}
		//如果对象不为空，则添加至数据库
		try {
			System.out.println("hello");
			new StudentDaoImple().addStudent(student);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	

}
