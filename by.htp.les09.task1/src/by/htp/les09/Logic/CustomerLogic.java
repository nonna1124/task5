package by.htp.les09.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.les09.entity.Clients;
import by.htp.les09.entity.Customer;

public class CustomerLogic {
	
public List<Customer> findClient(Clients client,String nicName){
		
		List<Customer> result=new ArrayList<Customer>();
		List<Customer> customer;
		customer=client.getCustomer();
		
		for(int i=0; i<customer.size();i++) {
			Customer b= customer.get(i);
			String name= b.getNicName();
			
			if(name.contains(nicName)){
				result.add(b);
			}
		}
		return result;
}
	
	
	public void sortName(List <Customer> person) {
	    Comparator<Customer> SortByNikName = new Comparator<Customer>() {

	      public int compare(Customer a, Customer b) {
	      return  a.getNicName().compareTo(b.getNicName());
	      }
	    };
	    
	    Collections.sort(person, SortByNikName);
	 }
}


