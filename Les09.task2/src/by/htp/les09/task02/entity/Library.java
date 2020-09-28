package by.htp.les09.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> books;
	
	public Library() {		
	books=new ArrayList<Book>();
	}
	
	public void add(Book book) {
		books.add(book);
	}
	public List<Book> getBook(){
		return books;
	}
}
