package by.htp.les09.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Clients {
	
	public List<Customer> person;
  
	public Clients() {
		person = new ArrayList<Customer>();
	}

	public void addClient(Customer client){
		person.add(client);
		
	}
	
	public Clients(List<Customer> person) {

		this.person = person;
	}

	public List<Customer> getCustomer() {
		return person;
	}
	
	

	@Override
	public String toString() {
		return "Clients [person=" + person + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clients other = (Clients) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
}