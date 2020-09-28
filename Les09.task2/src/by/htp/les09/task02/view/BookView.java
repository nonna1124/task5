package by.htp.les09.task02.view;

import java.util.List;

import by.htp.les09.task02.entity.Book;

public class BookView {
	
	public void print(String message, List<Book>books) {
		System.out.println("----------------------------------");
		
		for(int i=0; i<books.size();i++) {
			Book b= books.get(i);
			System.out.println(message+b);
		}
		
	}

}
