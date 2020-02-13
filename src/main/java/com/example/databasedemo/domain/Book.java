package com.example.databasedemo.domain;

import javax.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title;
	private String author;
	private String year;
	private String isbm;
	private String price;

	
	public Book() {
		
	}
	
	public Book(String title, String author, String year, String isbm, String price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbm = isbm;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIsbm() {
		return isbm;
	}
	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbm=" + isbm + ", price=" + price
				+ "]";
	}
	
	
}
