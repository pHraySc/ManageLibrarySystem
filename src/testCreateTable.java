import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.mysql.jdbc.Blob;
import com.panda.bean.Book;
import com.panda.bean.LendBook;
import com.panda.bean.Student;
import com.panda.daoImpl.LoginDaoImpl;
import com.panda.daoImpl.StudentDaoImple;
import com.panda.util.HibernateSessionFactory;


public class testCreateTable {

	/*@Test
	public void testCreate() throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		InputStream in = new FileInputStream(new File("/39074.jpg"));
		byte[] by = new byte[10240];
		in.read(by);
		Book book = new Book();
		book.setBook_Name("fjfa");
		book.setBook_Count(5);
		book.setBook_Content("这是一本怎样的书");
		book.setBook_Isbn("5844-21247-12");
		book.setBook_Price(11.2f);
		book.setBook_Photo(by);
		session.save(book);
		transaction.commit();
	}*/
	
	/*@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testCreate() throws Exception {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		LendBook lendBook = new LendBook();
		lendBook.setLendBook_Id("1");
		Set<LendBook> lendBooks = new HashSet<>();
		lendBooks.add(lendBook);
		Book book = new Book();
		book.setBook_Isbn("986-1478");
		book.setBook_Name("记者日记");
		book.setBook_Price(25.4f);
		book.setBook_Count(12);
		lendBook.setBook(book);
		Student stu = new Student();
		stu.setStu_Id("2014303");
		lendBook.setStudent(stu);
		session.save(stu);
		session.save(book);
		session.save(lendBook);
		transaction.commit();
		
	}*/
	@Test
	public void testEn() {
		Session session = HibernateSessionFactory.getSession();
		Student student = new LoginDaoImpl().ConfirmStudent("1","1");
		System.out.println(student.getStu_Name());
	}
	
}
