package by.htp.les09.task3.logic;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import by.htp.les09.task3.entity.Airline;
import by.htp.les09.task3.entity.Airport;

public class AirlineLogic {
	
	public List<Airline> findByDeparture(Airport airport,String destination){
		
		List<Airline>result=new ArrayList<Airline>();
		List<Airline> flight=airport.getAirline();
		
		for(int i=0; i<flight.size();i++) {
			Airline a=flight.get(i);
			String d=a.getDestination();
			
			if (d.contains(destination)) {
				result.add(a);
			}
		}
		return result;
	}
	public List<Airline>findByDay(Airport airport, String day){
		
		List<Airline> result2=new ArrayList<Airline>();
		List<Airline>flight=airport.getAirline();
		
		for(int i=0; i<flight.size();i++) {
			Airline a=flight.get(i);
			String d=a.getDay();
			
			if (d.contains(day)) {
				result2.add(a);
			}
		}
		return result2;
	}
	
    public List<Airline>findByTime(Airport airport,String day, LocalTime  time){
		
		List<Airline> result3=new ArrayList<Airline>();
		List<Airline>days=airport.getAirline();
		
		for(int i=0; i<days.size();i++) {
			Airline a=days.get(i);
			String d=a.getDay();
			LocalTime  p=a.getTimeDepurture();
			if (d.contains(day)&&(p.isAfter(time))) {
				result3.add(a);
			}  
		}	
			return result3;
		
	}	
		
} 	 
	

