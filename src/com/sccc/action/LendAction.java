package com.sccc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAOimpl.LendBookDaoImpl;
import com.sccc.entity.Book;
import com.sccc.entity.LendBook;
import com.sccc.entity.Student;

@SuppressWarnings("serial")
public class LendAction extends ActionSupport {
	private LendBookDaoImpl lendBookDaoImpl = new LendBookDaoImpl();
	private LendBook lendBook;
	private Student student;
	private Book book;
	
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
	public LendBook getLendBook() {
		return lendBook;
	}
	public void setLendBook(LendBook lendBook) {
		this.lendBook = lendBook;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(student.getStu_Id());
		lendBookDaoImpl.lendBook(lendBook, book, student);
		System.out.println("借书信息插入成功！");
		return SUCCESS;
	}
}