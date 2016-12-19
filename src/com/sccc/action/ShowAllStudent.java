package com.sccc.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAO.StudentDao;
import com.sccc.DAOimpl.StudentDaoImple;

/**
* @author MrC
* @date 2016年11月24日下午4:46:23
* @parameter
* @version
*/
@SuppressWarnings("serial")
@Controller("showAllStudent")
@Scope("prototype")
public class ShowAllStudent extends ActionSupport {
	
	@Resource(name = "StudentDao")
	private StudentDao studentDaoImple;
	
	@SuppressWarnings("rawtypes")
	public String showAll() {
		List allStudents = studentDaoImple.showAllStudents();
		if (allStudents == null) {
			return ERROR ;
		}
		ServletActionContext.getRequest().getSession().setAttribute("allStudents", allStudents);
		return SUCCESS ;
	}
}
