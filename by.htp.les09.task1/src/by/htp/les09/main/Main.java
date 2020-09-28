package by.htp.les09.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.les09.Logic.CustomerLogic;
import by.htp.les09.entity.Clients;
import by.htp.les09.entity.Customer;
import by.htp.les09.viewer.Print;

public class Main {
	
	public static void main(String[] args) {
		
		
		Clients clients= new Clients();
		clients.addClient(new Customer("1","Иванов","Минск",123456,"000001"));
		clients.addClient(new Customer("2","Сидоров","Гродно",654321,"000002"));
		clients.addClient(new Customer("3","Петров","Брест",789456,"000003"));
		clients.addClient(new Customer("4","Аникин","Кобрин",987654,"000004"));
		
	    CustomerLogic p=new CustomerLogic();
	    p.sortName(clients.getCustomer());
	 
	  
	    Print a=new Print();
	    a.print("Сортировка", clients.getCustomer() );
	    
	    a.print("Поиск  ", p.findClient(clients, "Сидоров"));
		
	}  
	}
