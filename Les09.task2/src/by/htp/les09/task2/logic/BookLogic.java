package by.htp.les09.task2.logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import by.htp.les09.task02.entity.Book;
import by.htp.les09.task02.entity.Library;

public class BookLogic {
	
	public List<Book> findAuthor(Library library,String author){
		
		List<Book> result=new ArrayList<Book>();
		List<Book>books;
		books=library.getBook();
		
		for(int i=0; i<books.size();i++) {
			Book b= books.get(i);
			String str= b.getSurName();
			
			if(str.contains(author)){
				result.add(b);
			}
		}
		return result;
	}
    public List<Book> findPrinter(Library library,String printer){
		
		List<Book> result1=new ArrayList<Book>();
		List<Book>books;
		books=library.getBook();
		
		for(int i=0; i<books.size();i++) {
			Book b= books.get(i);
			String str= b.getPrinter();
			
			if(str.contains(printer)){
				result1.add(b);
			}
		}
		return result1;
	}
    public List<Book> findDate(Library library, int date) {

        List<Book> result2 = new ArrayList<Book>();
        List<Book> books;
        books = library.getBook();

        for (int i = 0; i < books.size(); i++) {
          Book b = books.get(i);
          int str = b.getDate().get(GregorianCalendar.YEAR);
          if (str> date) {
              result2.add(b);
          }
        }
        return result2;
      }
    }
