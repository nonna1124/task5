package by.htp.les09.task3.viewer;

import java.util.List;

import by.htp.les09.task3.entity.Airline;

public class Print {
	
	public void printFlight(String message, List<Airline>airline) {
		System.out.println("----------------------------------");
		
		for(int i=0; i<airline.size();i++) {
			Airline b= airline.get(i);
			System.out.println(message+b);
		}
		
	}

}
