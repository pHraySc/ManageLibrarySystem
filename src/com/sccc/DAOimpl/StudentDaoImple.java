package com.sccc.DAOimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sccc.DAO.StudentDao;
import com.sccc.entity.Student;
import com.sccc.util.HibernateSessionFactory;

/*
* @author MrC
* @date 2016年11月18日上午8:58:10
* @parameter
* @version
*/
public class StudentDaoImple implements StudentDao {

	public void addStudent(Student student) {
		if (student == null) {
			throw new NullPointerException("传入对象为空");
		}
		Session session = null ;
		Transaction transaction = null ;
		try {
			//得到session
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			//添加对象
			session.save(student);
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			//事务的回滚
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public void deleteStudent(String Stu_Id) {
		if (Stu_Id == null && "".equals(Stu_Id)) {
			throw new NullPointerException("未传入有效参数");
		}
		Session session = null ;
		Transaction transaction = null ;
		try {
			//得到session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction();
			//得到查询出的Student对象
			Student student = (Student) session.get(Student.class, Stu_Id);
			//删除这个对象
			session.delete(student);
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	/*
	 * 显示所有学生
	*/
	@SuppressWarnings("rawtypes")
	public List showAllStudents() {
		Session session = null ;
		Transaction transaction = null ;
		List list =null;
		try {
			//创建session对象
			session = HibernateSessionFactory.getSession();
			//开启事务
			transaction = session.beginTransaction() ;
			/*
			 * Hql语句查询Student表中的所有数据
			*/
			Query query = session.createQuery("from Student");
			list = query.list();
			//提交事务
			transaction.commit();
			session.close();
		} catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}
}
