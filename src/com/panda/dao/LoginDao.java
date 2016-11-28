package com.panda.dao;

import com.panda.bean.Lib_Systemer;
import com.panda.bean.Student;
import com.panda.bean.Sys_Systemer;

/**
* @author MrC
* @date 2016年11月15日下午12:08:40
* @parameter
* @version
*/
public interface LoginDao {
	Student ConfirmStudent(String userName,String password);//验证学生账号和密码的方法
	Lib_Systemer ConfirmLibSystemer(String userName,String password);//验证图书管理员的方法
	Sys_Systemer ConfirmSysSystemer(String userName,String password);//验证系统管理员的方法
}
