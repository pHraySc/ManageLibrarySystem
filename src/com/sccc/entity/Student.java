package com.sccc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Stu_Id ;//学生学号
	private String Stu_Password ;//学生登录密码
	private String Stu_Name;//学生姓名
	private String Stu_Sex ;//学生性别
	private String Stu_Email ;//学生邮箱
	private Date Stu_Regist_Date ;//学生入学时间
	private Date Stu_Graduate_Date ;//学生毕业时间
	private Set<LendBook> lendBooks ;
	public Student(){
		
	}
	
	public Student(String stu_Id, String stu_Password, String stu_Name,
			String stu_Sex, String stu_Email, Date stu_Regist_Date,
			Date stu_Graduate_Date) {
		Stu_Id = stu_Id;
		Stu_Password = stu_Password;
		Stu_Name = stu_Name;
		Stu_Sex = stu_Sex;
		Stu_Email = stu_Email;
		Stu_Regist_Date = stu_Regist_Date;
		Stu_Graduate_Date = stu_Graduate_Date;
	}
	
	
	public Set<LendBook> getLendBooks() {
		return lendBooks;
	}

	public void setLendBooks(Set<LendBook> lendBooks) {
		this.lendBooks = lendBooks;
	}

	public String getStu_Id() {
		return Stu_Id;
	}
	public void setStu_Id(String stu_Id) {
		Stu_Id = stu_Id;
	}
	public String getStu_Password() {
		return Stu_Password;
	}
	public void setStu_Password(String stu_Password) {
		Stu_Password = stu_Password;
	}
	public String getStu_Name() {
		return Stu_Name;
	}
	public void setStu_Name(String stu_Name) {
		Stu_Name = stu_Name;
	}
	public String getStu_Sex() {
		return Stu_Sex;
	}
	public void setStu_Sex(String stu_Sex) {
		Stu_Sex = stu_Sex;
	}
	public String getStu_Email() {
		return Stu_Email;
	}
	public void setStu_Email(String stu_Email) {
		Stu_Email = stu_Email;
	}
	public Date getStu_Regist_Date() {
		return Stu_Regist_Date;
	}
	public void setStu_Regist_Date(Date stu_Regist_Date) {
		Stu_Regist_Date = stu_Regist_Date;
	}
	public Date getStu_Graduate_Date() {
		return Stu_Graduate_Date;
	}
	public void setStu_Graduate_Date(Date stu_Graduate_Date) {
		Stu_Graduate_Date = stu_Graduate_Date;
	}

	@Override
	public String toString() {
		return "Student [Stu_Id=" + Stu_Id + ", Stu_Password=" + Stu_Password
				+ ", Stu_Name=" + Stu_Name + ", Stu_Sex=" + Stu_Sex
				+ ", Stu_Email=" + Stu_Email + ", Stu_Regist_Date="
				+ Stu_Regist_Date + ", Stu_Graduate_Date=" + Stu_Graduate_Date
				+ "]";
	}
}
