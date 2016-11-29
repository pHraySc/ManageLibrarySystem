package com.sccc.DAOimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sccc.DAO.LendBookDao;
import com.sccc.entity.Book;
import com.sccc.entity.LendBook;
import com.sccc.entity.Student;
import com.sccc.util.HibernateSessionFactory;

/*
* @author MrC
* @date 2016年11月18日下午3:13:10
* @parameter
* @version
*/
public class LendBookDaoImpl implements LendBookDao {

	/*
	 * 根据学生学号，分页查询所借书籍
	*/
	@SuppressWarnings("rawtypes")
	public List queryLendBook(String Stu_Id, int pageNow, int pageSize) {
		Session session = null ;
		Transaction transaction = null ;
		List record = null ;
		try {
			//得到session
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			Query query = session.createQuery("from LendBook where Stu_ID=?");
			query.setParameter(0, Stu_Id);
			//分页查询
			query.setFirstResult(pageSize*(pageNow-1));//从哪一个序号开始
			query.setMaxResults(pageSize);//一次查询的范围
			record = query.list();
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return record;
	}

	/*
	 * 查询学生所借书籍的总量
	*/
	public int lendBookSize(String Stu_Id) {
		Session session = null ;
		Transaction transaction = null ;
		int lendSize = 0 ;
		try {
			//得到session
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			Query query = session.createQuery("from LendBook where Stu_ID=?");
			query.setParameter(0, Stu_Id);
			lendSize = query.list().size();
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return lendSize;
	}

	/*
	 * 借书
	*/
	public void lendBook(LendBook lendBook, Book book , Student student) {
		Session session = null ;
		Transaction transaction = null ;
		try {
			//得到sesion，加载配置，创建表
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			/*
			 * 联级存储
			*/			
			if (student == null || book == null) {
				throw new NullPointerException("对象为空");
			}
			lendBook.setStudent(student);
			lendBook.setBook(book);
			session.save(lendBook);
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//事务的回滚
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}

	public void returnBook(LendBook lendBook) {
		Session session = null ;
		Transaction transaction = null ;
		try {
			//加载配置，创建表
			session = HibernateSessionFactory.getSession() ;
			//开启事务
			transaction = session.beginTransaction();
			if (lendBook == null) {
				throw  new NullPointerException("传入对象为空");
			}
			/*
			 * 根据传入对象的id查看是否有该对象
			*/
			LendBook lendBook2 = (LendBook) session.get(LendBook.class, lendBook.getLendBook_Id());
			if (lendBook2 == null) {
				System.out.println("图书Id可能写错");
				throw new RuntimeException("得出对象为空");
			}
			session.delete(lendBook2);
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				//事务回滚
				transaction.rollback();
			}
		}
	}
}
