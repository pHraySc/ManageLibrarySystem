package com.sccc.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAO.LoginDao;
import com.sccc.DAOimpl.LoginDaoImpl;
import com.sccc.entity.Lib_Systemer;
import com.sccc.entity.Student;
import com.sccc.entity.Sys_Systemer;
/**
 * @author 沈诚
 */

@Controller("loginAction")
@Scope("prototype")
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	
	@Resource(name = "LoginDao")
	private LoginDao loginDaoImpl;
	
	private Student student;
	private Lib_Systemer libSystemer;
	private Sys_Systemer sysSystemer;
	private String username;
	private String password;
	private String role;
	private ActionContext ac;
	@SuppressWarnings("rawtypes")
	private Map session;
	@SuppressWarnings("rawtypes")
	private Map application;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Lib_Systemer getLibSystemer() {
		return libSystemer;
	}
	public void setLib_Systemer(Lib_Systemer libSystemer) {
		this.libSystemer = libSystemer;
	}
	public Sys_Systemer getSysSystemer() {
		return sysSystemer;
	}
	public void setSysSystemer(Sys_Systemer sysSystemer) {
		this.sysSystemer = sysSystemer;
	}
	public boolean isInvalid(String value){
		return value == null || value.length() == 0;
	}
	@Override
	public void validate() {
	}
	
	@SuppressWarnings({ "unchecked", "static-access" })
	@Override
	public String execute() throws Exception {
		application = ac.getContext().getApplication();
		session = ac.getContext().getSession();
		System.out.println(username + password +role);
		if(isInvalid(role)){
			application.put("tips", "职称选择错误");
			return INPUT;
		}
		System.out.println(role);
		if(role.equals("Student")){
			student = loginDaoImpl.ConfirmStudent(username,password);
			if(student == null){
				session.put("ErrorMsg", "不存在该学生用户");
				return INPUT;
			}
			session.put("stuName", student.getStu_Name());
			return "student";
		}else
		if(role.equals("Lib_Systemer")){
			System.out.println(role);
			libSystemer = loginDaoImpl.ConfirmLibSystemer(username,password);
			if(libSystemer == null){
				session.put("ErrorMsg", "不存在该图书管理员用户");
				return INPUT;
			}
			session.put("libSystemerName", libSystemer.getLib_Name());
			return "libSystemer";
		}else
		if(role.equals("Sys_Systemer")){
			sysSystemer = loginDaoImpl.ConfirmSysSystemer(username,password);
			if(sysSystemer == null){
				session.put("ErrorMsg", "不存在该系统管理员用户");
				return INPUT;
			}
			session.put("sysSystemerName", sysSystemer.getSys_Name());
			return "sysSystemer";
		}else
		return SUCCESS;
	}
}
