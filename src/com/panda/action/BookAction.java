package com.panda.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.ActionMessage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.panda.bean.Book;
import com.panda.daoImpl.BookDaoImple;

@SuppressWarnings({ "serial", "unused" })
public class BookAction extends ActionSupport {
	private BookDaoImple bookDaoImple = new BookDaoImple();
	private Book book;
	private File photo;
	private String photoFileName ;
	private String photoContentType ;
	private InputStream is;
	private byte[] buffer;
	private ActionContext actioncontext;
	private Map session = actioncontext.getContext().getSession();
	private HttpServletRequest request = ServletActionContext.getRequest();
	
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	private ActionContext ac;
	@SuppressWarnings("rawtypes")
	private Map request1;
	private String Book_Count;	//待转换的书本库存量
	private String Book_Price;		//待转换的书本价格
	
	
	public String getBook_Count() {
		return Book_Count;
	}
	public void setBook_Count(String book_Count) {
		Book_Count = book_Count;
	}
	public String getBook_Price() {
		return Book_Price;
	}
	public void setBook_Price(String book_Price) {
		Book_Price = book_Price;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	//增加图书
	@SuppressWarnings("unchecked")
	public String addBook() throws IOException {
		float bookPrice = Float.parseFloat(this.getBook_Price());
		int bookCount = Integer.parseInt(this.getBook_Count());
		is = new FileInputStream(this.getPhoto());
		buffer = new byte[is.available()];
		is.read(buffer);
		book.setBook_Photo(buffer);
		book.setBook_Count(bookCount);
		book.setBook_Price(bookPrice);
		bookDaoImple.addBook(book);
		System.out.println(book.getBook_Name() + " " + "：图书增加成功！");
		return SUCCESS;
	}
	//删除图书
	public String deleteBook() {
		bookDaoImple.deleteBook(book.getBook_Isbn());
		System.out.println("图书删除成功！");
		return SUCCESS;
	}
	//修改图书
	public String updateBook() throws IOException {
		Float bookPrice = Float.parseFloat(this.getBook_Price());
		Integer bookCount = Integer.parseInt(this.getBook_Count());
		is = new FileInputStream(this.getPhoto());
		buffer = new byte[is.available()];
		is.read(buffer);
		book.setBook_Photo(buffer);
		book.setBook_Count(bookCount);
		book.setBook_Price(bookPrice);
		bookDaoImple.updateBook(book);
		System.out.println(book.getBook_Name() + " " + "：图书更新成功！");
		return SUCCESS;
	}
	//查询图书
	@SuppressWarnings({ "rawtypes", "unchecked", "static-access" })
	public String selectBook() {
		System.out.println("图书查询成功！" + "\n" + "结果为：");
		Book selectedBook = bookDaoImple.queryBookByName(book.getBook_Isbn());
		request1 = (Map) actioncontext.getContext().get("request");
		request1.put("selectedBook", selectedBook);
		return "query";
	}
	//获取图片
	public void getImage() throws IOException{
		HttpServletResponse res = ServletActionContext.getResponse();
		Book b = bookDaoImple.queryBookByName(book.getBook_Isbn());
		byte[] photo = b.getBook_Photo();
		res.setContentType("image/*");
		ServletOutputStream fos = res.getOutputStream();
		if(photo != null && photo.length !=0){
			for(int i = 0; i<photo.length;i++){
				fos.write(photo[i]);
			}
			fos.flush();
		}
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("执行的execute方法");
		return SUCCESS;
	}
}
