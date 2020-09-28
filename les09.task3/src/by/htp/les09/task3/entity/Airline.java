package by.htp.les09.task3.entity;

import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class Airline {
	
	private String destination;
	private int numFlight;
	private String typePlane;
	private LocalTime timeDeparture;
	private String day;
	
	
	public Airline(String destination, int numFlight, String typePlane,LocalTime  timeDepurture, String day) {
		this.destination = destination;
		this.numFlight = numFlight;
		this.typePlane = typePlane;
		this.timeDeparture = timeDepurture;
		this.day = day;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumFlight() {
		return numFlight;
	}

	public void setNumFlight(int numFlight) {
		this.numFlight = numFlight;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public LocalTime  getTimeDepurture() {
		return timeDeparture;
	}

	public void setTimeDepurture(LocalTime  timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numFlight;
		result = prime * result + ((timeDeparture == null) ? 0 : timeDeparture.hashCode());
		result = prime * result + ((typePlane == null) ? 0 : typePlane.hashCode());
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
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numFlight != other.numFlight)
			return false;
		if (timeDeparture == null) {
			if (other.timeDeparture != null)
				return false;
		} else if (!timeDeparture.equals(other.timeDeparture))
			return false;
		if (typePlane == null) {
			if (other.typePlane != null)
				return false;
		} else if (!typePlane.equals(other.typePlane))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numFlight=" + numFlight + ", typePlane=" + typePlane
				+ ", timeDepurture=" + timeDeparture + ", day=" + day + "]";
	}
	
	
	

}
