package by.htp.les09.task02.entity;



import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String surName;
	private int page;
	private int price;
	private String typeOfTitle;
	public List<Book> books;
	private GregorianCalendar date;
	private String printer;
	
	
	public Book(int id, String title, String surName, int page, int price, String typeOfTitle,  String printer,GregorianCalendar date) {
		this.id = id;
		this.title = title;
		this.surName = surName;
		this.page = page;
		this.price = price;
		this.typeOfTitle = typeOfTitle;
		this.date = date;
		this.printer = printer;
	}

	public int getId() {
		return id;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getPrinter() {
		return printer;
	}

	public void setPrinter(String printer) {
		this.printer = printer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfTitle() {
		return typeOfTitle;
	}

	public void setTypeOfTitle(String typeOfTitle) {
		this.typeOfTitle = typeOfTitle;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", surName=" + surName + ", page=" + page + ", price=" + price
				+ ", typeOfTitle=" + typeOfTitle + ", date=" + date.getTime()+ ", printer=" + printer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + page;
		result = prime * result + price;
		result = prime * result + ((printer == null) ? 0 : printer.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfTitle == null) ? 0 : typeOfTitle.hashCode());
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
		Book other = (Book) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		if (printer == null) {
			if (other.printer != null)
				return false;
		} else if (!printer.equals(other.printer))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfTitle == null) {
			if (other.typeOfTitle != null)
				return false;
		} else if (!typeOfTitle.equals(other.typeOfTitle))
			return false;
		return true;
	}
	
	

}
