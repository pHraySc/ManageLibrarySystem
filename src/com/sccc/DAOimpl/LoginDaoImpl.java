package com.sccc.DAOimpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sccc.DAO.LoginDao;
import com.sccc.entity.Lib_Systemer;
import com.sccc.entity.Student;
import com.sccc.entity.Sys_Systemer;

/**
* @author MrC
* @date 2016年11月15日下午3:30:39
* @parameter userName是指账户名，password是指密码
* @version
*/
@Repository("LoginDao")
@Scope("prototype")
@Transactional(readOnly = false)
public class LoginDaoImpl implements LoginDao {

	@Resource(name="hibernateTemplate")
	//resource注入，在xml中已经注解，在这里注入
	private HibernateTemplate hibernateTemplate;
	
	//验证学生账号和密码
	@SuppressWarnings("rawtypes")
	public Student ConfirmStudent(String userName, String password) {
		System.out.println(userName+password);
		//如果传入的ID为空，直接返回null
		if (userName == null && "".equals(userName)) {
			return null ;
		}
		//创建数据库表
		Session session=this.hibernateTemplate.getSessionFactory().getCurrentSession();
		Transaction transaction = null ;
		Student student = null ;
		try {
			//开启事务
			transaction = session.beginTransaction();
			//利用hql语句，传入指定的参数，查询唯一的对象
			Query query = session.createQuery("from Student where STU_ID=? "
					+ "and STU_PASSWORD=?");
			query.setParameter(0, userName);
			query.setParameter(1, password);
			System.out.println(userName+password+"test");
			student  = (Student)query.uniqueResult();
			//如果查询得到的对象为空，返回null
			if (student == null) {
				return null;
			}
			//提交事务
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				//出错，事务回滚
				transaction.rollback();
			}
		}
		return student;
	}

	
	//验证图书管理员账号和密码
	@SuppressWarnings("rawtypes")
	public Lib_Systemer ConfirmLibSystemer(String userName, String password) {
				//如果传入的ID为空，直接返回null
				if (userName == null && "".equals(userName)) {
					return null ;
				}
				//创建数据库表
				Session session=this.hibernateTemplate.getSessionFactory().getCurrentSession();
				Transaction transaction = null ;
				Lib_Systemer lib_Systemer = null ;
				try {
					//开启事务
					transaction = session.beginTransaction();
					//利用hql语句，传入指定的参数，查询唯一的对象
					Query query = session.createQuery("from Lib_Systemer where LIB_COUNT=? "
							+ "and LIB_PASSWORD=?");
					query.setParameter(0, userName);
					query.setParameter(1, password);
					System.out.println(userName);
					lib_Systemer = (Lib_Systemer) query.uniqueResult();
					//如果查询得到的对象为空，返回null
					if (lib_Systemer == null) {
						return null;
					}
					//提交事务
					transaction.commit();
					
				} catch (Exception e) {
					if (transaction != null) {
						//出错，事务回滚
						transaction.rollback();
					}
				}
				return lib_Systemer;
	}

	//验证系统管理员账号和密码
	@SuppressWarnings("rawtypes")
	public Sys_Systemer ConfirmSysSystemer(String userName, String password) {
				//如果传入的ID为空，直接返回null
				if (userName == null && "".equals(userName)) {
					return null ;
				}
				//创建数据库表
				Session session=this.hibernateTemplate.getSessionFactory().getCurrentSession();
				Transaction transaction = null ;
				Sys_Systemer system = null ;
				try {
					//开启事务
					transaction = session.beginTransaction();
					//利用hql语句，传入指定的参数，查询唯一的对象
					Query query = session.createQuery("from Sys_Systemer where Sys_Count=? "
							+ "and Sys_Password=?");
					query.setParameter(0, userName);
					query.setParameter(1, password);
					List list = query.list();
					system = (Sys_Systemer) list.get(0);
					//如果查询得到的对象为空，返回null
					if (system == null) {
						return null;
					}
					//提交事务
					transaction.commit();
					
				} catch (Exception e) {
					if (transaction != null) {
						//出错，事务回滚
						transaction.rollback();
					}
				}
				return system;
	}
}
