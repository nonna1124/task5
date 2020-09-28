package by.htp.les09.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Airport {
	
	List<Airline>flight=new ArrayList<Airline>();
	
	public void add(Airline airline) {
		flight.add(airline);
	}
	
	public  List<Airline>  getAirline() {
		return flight;
	}
	

}
