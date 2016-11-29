package com.sccc.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

import com.mysql.jdbc.Blob;

/*
* @author MrC
* @date 2016年11月17日下午6:13:29
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class Book implements Serializable{
	private String Book_Isbn ;
	private String Book_Name ;
	private String Book_Editor ;
	private String Book_Pushing ;
	private String Book_Content ;
	private Float Book_Price ;
	private Integer Book_Count ;
	private byte[] Book_Photo ;
	private Set<LendBook> lendBooks ;
	
	public Book() {
		
	}
	
	public Set<LendBook> getLendBooks() {
		return lendBooks;
	}

	public void setLendBooks(Set<LendBook> lendBooks) {
		this.lendBooks = lendBooks;
	}




	public byte[] getBook_Photo() {
		return Book_Photo;
	}

	public void setBook_Photo(byte[] book_Photo) {
		Book_Photo = book_Photo;
	}

	public void setBook_Count(Integer book_Count) {
		Book_Count = book_Count;
	}

	public String getBook_Isbn() {
		return Book_Isbn;
	}

	public void setBook_Isbn(String book_Isbn) {
		Book_Isbn = book_Isbn;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getBook_Editor() {
		return Book_Editor;
	}

	public void setBook_Editor(String book_Editor) {
		Book_Editor = book_Editor;
	}

	public String getBook_Pushing() {
		return Book_Pushing;
	}

	public void setBook_Pushing(String book_Pushing) {
		Book_Pushing = book_Pushing;
	}

	public String getBook_Content() {
		return Book_Content;
	}

	public void setBook_Content(String book_Content) {
		Book_Content = book_Content;
	}

	public Float getBook_Price() {
		return Book_Price;
	}

	public void setBook_Price(Float book_Price) {
		Book_Price = book_Price;
	}

	public Integer getBook_Count() {
		return Book_Count;
	}

	@Override
	public String toString() {
		return "Book [Book_Isbn=" + Book_Isbn + ", Book_Name=" + Book_Name
				+ ", Book_Editor=" + Book_Editor + ", Book_Pushing="
				+ Book_Pushing + ", Book_Content=" + Book_Content
				+ ", Book_Price=" + Book_Price + ", Book_Count=" + Book_Count
				+ ", Book_Photo=" + Arrays.toString(Book_Photo)
				+ ", lendBooks=" + lendBooks + "]";
	}

}
