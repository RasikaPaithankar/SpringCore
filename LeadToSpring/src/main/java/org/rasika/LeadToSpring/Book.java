package org.rasika.LeadToSpring;

import java.util.Map;

public class Book {
	int bId;
	String bookName;
	Map<String, Integer> bookAuthorAndPrice;
	
	public Book() {
		
	}
	
	public Book(int bId, String bookName) {
		super();
		this.bId = bId;
		this.bookName = bookName;
	}

	public Book(int bId, String bookName,Map<String, Integer> bookAuthorAndPrice) {
		super();
		this.bId = bId;
		this.bookName = bookName;
		this.bookAuthorAndPrice = bookAuthorAndPrice;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}	
	public Map<String, Integer> getBookAuthorAndPrice() {
		return bookAuthorAndPrice;
	}
	public void setbookAuthorAndPrice(Map<String, Integer> bookAuthorAndPrice) {
		this.bookAuthorAndPrice = bookAuthorAndPrice;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + ", bookAuthorAndPrice=" + bookAuthorAndPrice + "]";
	}
}
