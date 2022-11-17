package com.book;

import java.util.*;

import com.book.exception.InvalidBookException;


public class Book {
	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;
	

public String getBookID() {
	return bookID;
}

public void setBookID(String bookID) {
	this.bookID = bookID;
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

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
	this.bookID = bookID;
	this.title = title;
	this.price = price;
	this.category = category;
	this.author = author;
	
	String[] categories = {"Science" , "Fiction" , "Technology" , "Others"};
	List<String>categorylist = new ArrayList<String>();
	for(String category1:categories) {
		categorylist.add(category1);
	}
	if(bookID.length()==4 && bookID.charAt(0)=='B') {
		setBookID(bookID);
	}	
	else { 
		throw new InvalidBookException();
	}
	
	if(price>0) {
		setPrice(price);
	}	
	else { 
		throw new InvalidBookException();
	}

	if(categorylist.indexOf(category)!=-1) {
		setCategory(category);
	}
	else { 
		throw new InvalidBookException();
	}

}
}

