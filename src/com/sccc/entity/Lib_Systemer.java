package com.sccc.entity;

import java.io.Serializable;

public class Lib_Systemer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Lib_Count ;//图书管理员账号
	private String Lib_Name ;//图书管理员名字
	private String Lib_Password ;//图书管理员密码
	private String Lib_Sex ;//图书管理员性别
	private String Lib_Birthday ;//图书管理员出生日期
	private String Lib_Email ;//图书管理员邮箱
	private String Lib_Phone ;//图书管理员电话
	public Lib_Systemer(){
		
	}
	
	public Lib_Systemer(String lib_Count, String lib_Name, String lib_Password,
			String lib_Sex, String lib_Birthday, String lib_Email,
			String lib_Phone) {
		super();
		Lib_Count = lib_Count;
		Lib_Name = lib_Name;
		Lib_Password = lib_Password;
		Lib_Sex = lib_Sex;
		Lib_Birthday = lib_Birthday;
		Lib_Email = lib_Email;
		Lib_Phone = lib_Phone;
	}
	public String getLib_Count() {
		return Lib_Count;
	}
	public void setLib_Count(String lib_Count) {
		Lib_Count = lib_Count;
	}
	public String getLib_Name() {
		return Lib_Name;
	}
	public void setLib_Name(String lib_Name) {
		Lib_Name = lib_Name;
	}
	public String getLib_Password() {
		return Lib_Password;
	}
	public void setLib_Password(String lib_Password) {
		Lib_Password = lib_Password;
	}
	public String getLib_Sex() {
		return Lib_Sex;
	}
	public void setLib_Sex(String lib_Sex) {
		Lib_Sex = lib_Sex;
	}
	public String getLib_Birthday() {
		return Lib_Birthday;
	}
	public void setLib_Birthday(String lib_Birthday) {
		Lib_Birthday = lib_Birthday;
	}
	public String getLib_Email() {
		return Lib_Email;
	}
	public void setLib_Email(String lib_Email) {
		Lib_Email = lib_Email;
	}
	public String getLib_Phone() {
		return Lib_Phone;
	}
	public void setLib_Phone(String lib_Phone) {
		Lib_Phone = lib_Phone;
	}

}
