package com.panda.bean;

import java.io.Serializable;

public class Sys_Systemer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Sys_Count ;//系统管理员账号
	private String Sys_Name ;//系统管理员名字
	private String Sys_Password ;//系统管理员密码
	private String Sys_Sex ;//系统管理员性别
	private String Sys_Birthday ;//系统管理员出生日期
	private String Sys_Email ;//系统管理员邮箱
	private String Sys_Phone ;//系统管理员电话
	public Sys_Systemer(){
		
	}
	
	public Sys_Systemer(String sys_Count, String sys_Name, String sys_Password,
			String sys_Sex, String sys_Birthday, String sys_Email,
			String sys_Phone) {
		super();
		Sys_Count = sys_Count;
		Sys_Name = sys_Name;
		Sys_Password = sys_Password;
		Sys_Sex = sys_Sex;
		Sys_Birthday = sys_Birthday;
		Sys_Email = sys_Email;
		Sys_Phone = sys_Phone;
	}
	public String getSys_Count() {
		return Sys_Count;
	}
	public void setSys_Count(String sys_Count) {
		Sys_Count = sys_Count;
	}
	public String getSys_Name() {
		return Sys_Name;
	}
	public void setSys_Name(String sys_Name) {
		Sys_Name = sys_Name;
	}
	public String getSys_Password() {
		return Sys_Password;
	}
	public void setSys_Password(String sys_Password) {
		Sys_Password = sys_Password;
	}
	public String getSys_Sex() {
		return Sys_Sex;
	}
	public void setSys_Sex(String sys_Sex) {
		Sys_Sex = sys_Sex;
	}
	public String getSys_Birthday() {
		return Sys_Birthday;
	}
	public void setSys_Birthday(String sys_Birthday) {
		Sys_Birthday = sys_Birthday;
	}
	public String getSys_Email() {
		return Sys_Email;
	}
	public void setSys_Email(String sys_Email) {
		Sys_Email = sys_Email;
	}
	public String getSys_Phone() {
		return Sys_Phone;
	}
	public void setSys_Phone(String sys_Phone) {
		Sys_Phone = sys_Phone;
	}

}
