package com.sccc.DAO;

import java.util.List;

import com.sccc.entity.Book;

/*
* @author MrC
* @date 2016年11月17日下午7:49:23
*/
public interface BookDao {
	void addBook(Book book); //添加图书
	void deleteBook(String Isbn);//删除图书
	void updateBook(Book book);//修改图书
	Book queryBookByName(String bookName);//根据书名查询图书
	@SuppressWarnings("rawtypes")
	List queryBookByNames(String Book_Name);//根据书名返回所有符合情况的书籍
	@SuppressWarnings("rawtypes")
	List queryBookFormPages(String BookName, int pageNow, int pageSize);
	public int booksSize(String BookName);
}
