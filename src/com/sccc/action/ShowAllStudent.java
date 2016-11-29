package com.sccc.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAOimpl.StudentDaoImple;

/*
* @author MrC
* @date 2016年11月24日下午4:46:23
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class ShowAllStudent extends ActionSupport {
	public String showAll() {
		List allStudents = new StudentDaoImple().showAllStudents();
		if (allStudents == null) {
			return ERROR ;
		}
		ServletActionContext.getRequest().getSession().setAttribute("allStudents", allStudents);
		return SUCCESS ;
	}
}
