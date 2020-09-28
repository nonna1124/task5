package by.htp.les09.entity;

import java.util.List;

public class Customer {
	
	private String id;
	private String nicName;
	private String addres;
	private int numCard;
	private String numScore;
	

	public Customer(String id, String nicName, String addres, int numCard, String numScore) {

		this.id =id;
		this.nicName = nicName;
		this.addres = addres;
		this.numCard = numCard;
		this.numScore = numScore;

	} 
	public void print() {
		System.out.println(toString());
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNicName() {
		return nicName;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public int getNumCard() {
		return numCard;
	}
	public void setNumCard(int numCard) {
		this.numCard = numCard;
	}
	public String getNumScore() {
		return numScore;
	}
	public void setNumScore(String numScore) {
		this.numScore = numScore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addres == null) ? 0 : addres.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nicName == null) ? 0 : nicName.hashCode());
		result = prime * result + numCard;
		result = prime * result + ((numScore == null) ? 0 : numScore.hashCode());
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
		Customer other = (Customer) obj;
		if (addres == null) {
			if (other.addres != null)
				return false;
		} else if (!addres.equals(other.addres))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nicName == null) {
			if (other.nicName != null)
				return false;
		} else if (!nicName.equals(other.nicName))
			return false;
		if (numCard != other.numCard)
			return false;
		if (numScore == null) {
			if (other.numScore != null)
				return false;
		} else if (!numScore.equals(other.numScore))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nicName=" + nicName + ", addres=" + addres + ", numCard=" + numCard
				+ ", numScore=" + numScore + "]";
	}
	
}
