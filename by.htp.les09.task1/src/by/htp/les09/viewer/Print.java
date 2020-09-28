package by.htp.les09.viewer;

import java.util.List;

import by.htp.les09.entity.Customer;

public class Print {
	public void print(String message, List<Customer>customer) {
		System.out.println("----------------------------------");
		
		for(int i=0; i<customer.size();i++) {
			Customer b= customer.get(i);
			System.out.println(message+b);
		}
		
	}


}
