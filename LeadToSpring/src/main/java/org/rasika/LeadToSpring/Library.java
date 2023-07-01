package org.rasika.LeadToSpring;

import java.util.List;

public class Library {

	Teacher assignedTeacher;
	List<Book> book;
	List<String> comics;
	
	public Library() {
		super();
	}

	public Library(Teacher assignedTeacher,List<Book> book,List<String> comics) {
		super();
		this.assignedTeacher = assignedTeacher;
		this.book = book; 
		this.comics = comics;
	}

	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public List<String> getComics() {
		return comics;
	}

	public void setComics(List<String> comics) {
		this.comics = comics;
	}

	public void printLibraryDetails(Library l) {
		System.out.println("Library assigned Teacher is " + l.getAssignedTeacher() + " and list of books" +l.getBook() + " list of comics " + l.getComics());
	}

	@Override
	public String toString() {
		return "Library [assignedTeacher=" + assignedTeacher + ", book=" + book + ", comics=" + comics + "]";
	}	
}
