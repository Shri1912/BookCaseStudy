package com.bookutil;

import java.util.Scanner;

import com.book.*;

import com.book.exception.InvalidBookException;

public class BookUtil {

	public Book getbkobj() throws InvalidBookException{

		Scanner sc = new Scanner(System.in);
		System.out.println("BookID:");
		String BookId = sc.nextLine();
		
		System.out.println("Title:");
		String Title = sc.nextLine();
		
		System.out.println("Author:");
		String Author = sc.nextLine();
		
		System.out.println("Category:");
		String Category = sc.nextLine();
		
		System.out.println("Price:");
		float Price = sc.nextFloat();
		
		Book b1 = new Book(BookId,Title,Author,Category,Price);
		return b1;
	}
	
	public String getString() {
		
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		return val;
	}
	
	public static void main(String[] args) throws InvalidBookException{
		BookUtil butil = new BookUtil();
		BookStore bs = new BookStore();
		for(int i= 1;i<=2;i++) {
			System.out.println("Enter Book Details:"+i+"\n");
			bs.addBook(butil.getbkobj());
		}
		System.out.println("Book details added successfully!!");
		
		Scanner sc1  = new Scanner(System.in);
		System.out.println("Search by Author Name:");
		String s = butil.getString();
		System.out.println(s);
		bs.display(bs.searchByAuthor(s));
		System.out.println("Search by Title Name:");
		bs.display(bs.searchByTitle(butil.getString()));
		
		bs.displayAll();
		
		int Id;
		do {
			System.out.println("\n1.Add\n2.Modify\n3.Delete\n4.DisplayAll\n5.DisplaySpecific\n6.SearchByTitle\n7.SearchByAuthor\n8.Exit\n");
			System.out.println("Enter appropriate value:");
			Id = sc1.nextInt();
			switch(Id){
			case 1: 
				bs.addBook(butil.getbkobj());
				System.out.println("Book is Added!!");
				break;
			
			case 2:
				Book bsnew = butil.getbkobj();
				boolean tomodify = bs.modifyBook(bsnew.getBookID());
				if(tomodify == true) {
					bs.deleteBook(bsnew.getBookID());
					bs.addBook(bsnew);
				}
				else {
					System.out.println("No book modification");
				}
			
			case 3:
				System.out.println("Provide BookId to Delete:");
				bs.deleteBook(butil.getString());
				break;
				
			case 4:
				bs.displayAll();
				break;
				
			case 5:
				System.out.println("Provide specific BookId:");
				bs.displaybyid(butil.getString());
				break;
				
			case 6:
				System.out.println("Provide tittle to find:");
				bs.display(bs.searchByTitle(butil.getString()));
				break;
				
			case 7:
				System.out.println("Provide author to find:");
				bs.display(bs.searchByAuthor(butil.getString()));
				break;
				
			default:
				System.out.println("Process Completed!!!");
				break;
			}
		}while(Id<8);
	}
	

}
