package com.panda.dao;

import java.util.List;

import com.panda.bean.Student;

/*
* @author MrC
* @date 2016年11月18日上午8:57:44
* @parameter
* @version
*/
public interface StudentDao {
	@SuppressWarnings("rawtypes")
	List showAllStudents() ;//显示所有学生
	void addStudent(Student student);//添加学生信息
	void deleteStudent(String Stu_Id);//删除学生
}
