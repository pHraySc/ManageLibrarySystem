package com.sccc.DAOimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sccc.DAO.BookDao;
import com.sccc.entity.Book;
import com.sccc.util.HibernateSessionFactory;

/*
* @author MrC
* @date 2016年11月17日下午8:34:04
* @parameter
* @version
*/
public class BookDaoImple implements BookDao {
	
	public int booksSize(String BookName){
		Session session = null ;
		Transaction transaction = null ;
		int BooksSize = 0 ;
		try {
			//得到session
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			Query query = session.createQuery("from Book where Book_Name=?");
			query.setParameter(0, BookName);
			BooksSize = query.list().size();
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return BooksSize;
	}
	
	public List queryBookFormPages(String BookName, int pageNow, int pageSize){
		Session session = null;
		Transaction transaction = null;
		List books = null;
		try {
			//通过sessionFactory获取session
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			Query q = session.createQuery("from Book where Book_Name=?");
			q.setParameter(0, BookName);
			//分页操作
			q.setFirstResult(pageSize*(pageNow-1));
			q.setMaxResults(pageSize);
			books = q.list();
			//提交事务
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			if(transaction != null){
				transaction.rollback();
			}
		}
		return books;
	}

	public void addBook(Book book) {
		//对象为空，则抛出空异常
		if (book == null) {
			throw new NullPointerException("传入对象为空");
		} 
		Session session = null ;
		Transaction transaction = null ;
		try {
			//获得Session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			//插入数据
			session.save(book);
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//如果事务对象不为空，事务回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} 
		
	}

	public void deleteBook(String Isbn) {
		if (Isbn == null && "".equals(Isbn)) {
			throw new NullPointerException("未传入有效参数");
		}
		Session session = null ;
		Transaction transaction = null ;
		try {
			//获得Session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			
			Query query = session.createQuery("from Book where BOOK_ISBN=?");
			//设置参数
			query.setParameter(0, Isbn);
			//设置检索最大行数为1
			query.setMaxResults(1);
			
			Book book = (Book) query.uniqueResult();
			//删除图书
			session.delete(book);
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//如果事务对象不为空，事务回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} 
	}

	public void updateBook(Book book) {
		//对象为空，则抛出空异常
		if (book == null) {
			throw new NullPointerException("传入对象为空");
		} 
		Session session = null ;
		Transaction transaction = null ;
		try {
			//获得Session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			//更新数据
			session.update(book);
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//如果事务对象不为空，事务回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} 
	}

	public Book queryBookByName(String bookIsbn) {
		Session session = null ;
		Transaction transaction = null ;
		Book book = null ;
		try {
			//获得Session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			
			Query query = session.createQuery("from Book where BOOK_ISBN=?");
			//设置参数
			query.setParameter(0, bookIsbn);
			//设置检索最大行数为1
			query.setMaxResults(1);
			//得到唯一的对象
			book = (Book) query.uniqueResult();
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//如果事务对象不为空，事务回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}	
		if(book == null) {
			throw new RuntimeException("没有此参数");
		}
		return book ;
	}
	/*
	 * 根据书名在数据库中查询数据，返回所有符合相同名字的书籍
	*/
	@SuppressWarnings("rawtypes")
	public List queryBookByNames(String Book_Name) {
		List allBook = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			//获得Session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			System.out.println(Book_Name);
			Query query = session.createQuery("from Book where BOOk_NAME=?");
			//设置参数
			query.setParameter(0, Book_Name);
			//查询得到所有书籍
			allBook = query.list();
			System.out.println(allBook.size());
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//如果事务对象不为空，事务回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}	
		if(allBook == null) {
			throw new RuntimeException("没有此参数");
		}
		return allBook;
	}
}
