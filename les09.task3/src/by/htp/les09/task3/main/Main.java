package by.htp.les09.task3.main;


 
import java.time.LocalTime;
import java.util.Date;

import by.htp.les09.task3.entity.Airline;
import by.htp.les09.task3.entity.Airport;
import by.htp.les09.task3.logic.AirlineLogic;
import by.htp.les09.task3.viewer.Print;

public class Main {
	public static void main(String[] args) {
		
	Airport air=new Airport();
	
	air.add(new Airline("������",123,"Boing",LocalTime.of(10,30),"Friday"));
	air.add(new Airline("������",145,"��-57",LocalTime.of(14, 25) ,"Monday"));
	air.add(new Airline("�����",170,"��-57",LocalTime.of(23,15),"Monday"));
	air.add(new Airline("���-����",145,"Boing",LocalTime.of (6,00),"Tuesday"));
	air.add(new Airline("����",960,"Boing",LocalTime.of(11,00),"Tuesday"));
		
	AirlineLogic a= new AirlineLogic();
	Print p=new Print();
	
	p.printFlight("����� � ������", a.findByDeparture(air, "������"));
	
	p.printFlight("����� � �����������", a.findByDay(air, "Monday"));
	
	p.printFlight("����� ����� 6", a.findByTime(air, "Monday",LocalTime.of(16, 00)));
    }

}
