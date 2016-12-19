package com.sccc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAO.LendBookDao;
import com.sccc.DAOimpl.LendBookDaoImpl;
import com.sccc.entity.Book;
import com.sccc.entity.LendBook;
import com.sccc.entity.Student;

@Controller("lendAction")
@Scope("prototype")
@SuppressWarnings("serial")
public class LendAction extends ActionSupport {
	
	@Resource(name = "LendBookDao")
	private LendBookDao lendBookDaoImpl;
	
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
