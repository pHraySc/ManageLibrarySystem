package com.panda.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.panda.bean.LendBook;
import com.panda.bean.Student;
import com.panda.daoImpl.BookDaoImple;
import com.panda.daoImpl.LendBookDaoImpl;
import com.panda.util.Pager;

public class ReturnBookAction extends ActionSupport {
	private HttpServletRequest request;
	private ServletActionContext sac;
	private ActionContext ac;
	private LendBookDaoImpl lendBookDaoImple = new LendBookDaoImpl();
	private Student student;
	private int pageNow = 1;
	private int pageSize = 4;
	LendBook lendBook;
	

	public LendBook getLendBook() {
		return lendBook;
	}

	public void setLendBook(LendBook lendBook) {
		this.lendBook = lendBook;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String execute() throws Exception {
		lendBookDaoImple.returnBook(lendBook);
		return SUCCESS;
	}
}
