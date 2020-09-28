package by.htp.les09.task02.main;

import java.util.GregorianCalendar;
import java.util.List;
import by.htp.les09.task02.entity.Book;
import by.htp.les09.task02.entity.Library;
import by.htp.les09.task02.view.BookView;
import by.htp.les09.task2.logic.BookLogic;

public class Main {
	public static void main(String[] args) {
		
		Library bk=new Library();
		
		bk.add(new Book(1,"Java","Иванов",200,1200,"soft title","ide1", new GregorianCalendar(2017,01,25) ));
		bk.add(new Book(2,"C++","Петров",50,100,"Hard title","ide2", new GregorianCalendar(2012,02,18) ));
		bk.add(new Book(3,"Pascal","Сидоров",150,300,"Hard title","ide1", new GregorianCalendar(2020,05,12) ));
		
		BookLogic logic= new BookLogic();
		
		List<Book> res= logic.findAuthor(bk, "Иванов");
		
		BookView view= new BookView();
		
		view.print("ПОиск по фамилии ", res);
				
		List<Book> res1= logic.findPrinter(bk,"ide1");
		
		view.print("Поиск по издательству", res1);
		
		List<Book> res2= logic.findDate(bk,2015);
		
		view.print("Поиск по году  ", res2);
	}
 
} 
