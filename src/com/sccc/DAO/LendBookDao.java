package com.sccc.DAO;

import java.util.List;

import com.sccc.entity.Book;
import com.sccc.entity.LendBook;
import com.sccc.entity.Student;

/*
* @author MrC
* @date 2016年11月17日下午8:35:13
* @parameter
* @version
*/
public interface LendBookDao {
	 @SuppressWarnings("rawtypes")
	List queryLendBook(String Stu_Id , int pageNow , int pageSize);//根据图书学生学号查询所借图书
	int lendBookSize(String Stu_Id);//根据学号查询出该学生所借图书数量
	void lendBook(LendBook lendBook , Book book ,Student student);//借书，更新对应的消息
	void returnBook(LendBook lendBook);//还书，更新对应信息
}
