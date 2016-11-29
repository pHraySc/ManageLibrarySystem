package com.sccc.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAOimpl.BookDaoImple;
import com.sccc.entity.Book;
import com.sccc.entity.Student;
import com.sccc.util.Pager;

public class QueryBookAction extends ActionSupport {
	private HttpServletRequest request;
	private ServletActionContext sac;
	private ActionContext ac;
	private BookDaoImple bookDaoImple = new BookDaoImple();
	private String bookName;
	private int pageNow = 1;
	private int pageSize = 4;
	

	public int getPageNow() {
		return pageNow;
	}


	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String execute() throws Exception {
		if(bookName ==null||bookName.length() == 0){
			ac.getContext().getSession().put("noneBook_Name", "请输入图书书名：");
			return "noneBook_Name";
		}
		List list = bookDaoImple.queryBookFormPages(bookName, pageNow, pageSize);
		Pager page = new Pager(this.getPageNow(), bookDaoImple.booksSize(bookName));
		Map request = (Map) ActionContext.getContext().get("request");
		System.out.println(list.size());
		request.put("list", list);
		request.put("page3", page);
		request.put("bookName", bookName);
		return SUCCESS;
	}
}
