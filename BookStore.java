package com.book;
import java.util.*;

public class BookStore {
	List<Book>BList = new ArrayList<Book>();
	public void addBook(Book b) {
		BList.add(b);
	}
	
	public void deleteBook(String bookID) {
		Iterator<Book>iter = BList.iterator();
		while(iter.hasNext()) {
			if(iter.next().getBookID().equals(bookID)) {
				iter.remove();
			}
		}
	}
	
	public boolean modifyBook(String Bookid) {
		int c=0;
		for(Book b:BList) {
			if(b.getBookID().equals(Bookid)) {
				c=c+1;
			}
		}
		if(c>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void display(List<Book> BList) {
		System.out.println("Details of Book:");
		System.out.println("BookID\tTitle\tAuthor\tCategory\tPrice\t");
		for(Book b :BList) {
			System.out.println(b.getBookID()+"    "+b.getTitle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());
		}
	}
	
	public void displaybyid(String Bookid) {
		System.out.println("BookID\tTitle\tAuthor\tCategory\tPrice\t");
		for(Book b:BList) {
			if(b.getBookID().equals(Bookid)) {
				System.out.println(b.getBookID()+"    "+b.getTitle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());	
			}
		}
	}
	
	public void displayAll() {
		System.out.println("Details of Book:");
		System.out.println("BookID\tTitle\tAuthor\tCategory\tPrice\t");
		for(Book b:BList) {
			System.out.println(b.getBookID()+"    "+b.getTitle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());
		}
	}
	
	public List<Book> searchByTitle(String title) {
		List<Book> selectedList = new ArrayList<Book>();
		for(Book b:BList) {
			if(b.getTitle().equals(title)) {
				selectedList.add(b);
			}
		}
		return selectedList;
	}
	
	public List<Book> searchByAuthor(String author){
		System.out.println(author);
		List<Book> selectedList = new ArrayList<Book>();
		System.out.println(BList);
		Iterator<Book>iter = BList.iterator();
		while(iter.hasNext()) {
			Book b = iter.next();
			System.out.println("Author name is:" +b.getAuthor());
			if(b.getAuthor().equals(author)) {
				
				selectedList.add(b);
			}
		}
		
		return selectedList;
	}
}
