package com.sccc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAO.StudentDao;
import com.sccc.DAOimpl.StudentDaoImple;
import com.sccc.entity.Student;

/*
* @author MrC
* @date 2016年11月24日下午2:33:32
* @parameter
* @version
*/
@SuppressWarnings("serial")
@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport {
	private Student student;//构造模型
	
	@Resource(name = "StudentDao")
	private StudentDao studentDaoImple;

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
			studentDaoImple.addStudent(student);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	

}
