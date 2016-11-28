package com.panda.bean;

import java.io.Serializable;
import java.util.Date;

/*
* @author MrC
* @date 2016年11月17日下午4:07:08
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class LendBook implements Serializable {
	
	private String LendBook_Id ;
	private String LendBook_Name ;
	private String LendBook_Pushing ;
	private float LendBook_Price ;
	private Date LendBook_Time ;
	private Date LendBook_Return ;
	
	private Student student ;
	private Book book ;
	


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}




	public LendBook() {
		
	}


	public String getLendBook_Id() {
		return LendBook_Id;
	}

	public void setLendBook_Id(String lendBook_Id) {
		LendBook_Id = lendBook_Id;
	}


	public String getLendBook_Name() {
		return LendBook_Name;
	}

	public void setLendBook_Name(String lendBook_Name) {
		LendBook_Name = lendBook_Name;
	}

	public String getLendBook_Pushing() {
		return LendBook_Pushing;
	}

	public void setLendBook_Pushing(String lendBook_Pushing) {
		LendBook_Pushing = lendBook_Pushing;
	}

	public float getLendBook_Price() {
		return LendBook_Price;
	}

	public void setLendBook_Price(float lendBook_Price) {
		LendBook_Price = lendBook_Price;
	}

	public Date getLendBook_Time() {
		return LendBook_Time;
	}

	public void setLendBook_Time(Date lendBook_Time) {
		LendBook_Time = lendBook_Time;
	}

	public Date getLendBook_Return() {
		return LendBook_Return;
	}

	public void setLendBook_Return(Date lendBook_Return) {
		LendBook_Return = lendBook_Return;
	}
	
}
