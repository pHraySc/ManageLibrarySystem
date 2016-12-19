package com.sccc.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sccc.DAO.LendBookDao;
import com.sccc.DAOimpl.LendBookDaoImpl;
import com.sccc.entity.Student;
import com.sccc.util.Pager;

@Controller("queryLendBookAction")
@Scope("prototype")
@SuppressWarnings("serial")
public class QueryLendBookAction extends ActionSupport {
	
	@Resource(name = "LendBookDao")
	private LendBookDao lendBookDaoImple;
	
	private HttpServletRequest request;
	@SuppressWarnings("unused")
	private ServletActionContext sac;
	private ActionContext ac;
	private Student student;
	private int pageNow = 1;
	private int pageSize = 4;

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

	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public String queryLendBook(){
		if(student.getStu_Id() ==null||student.getStu_Id().length() == 0){
			ac.getContext().getSession().put("noneStu_Id", "请输入借书证号：");
			return "noneStu_Id";
		}
		List list = lendBookDaoImple.queryLendBook(student.getStu_Id(), this.getPageNow(), pageSize);
		Pager page = new Pager(this.getPageNow(), lendBookDaoImple.lendBookSize(student.getStu_Id()));
		Map request = (Map) ActionContext.getContext().get("request");
		System.out.println(list.size());
		request.put("queryList1", list);
		request.put("page", page);
		request.put("lendId", student.getStu_Id());
		return SUCCESS;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		List list = lendBookDaoImple.queryLendBook(student.getStu_Id(),
				pageNow, pageSize);
		request = ServletActionContext.getRequest();
		request.setAttribute("lendBookList", list);
		return SUCCESS;
	}
}
