package model;

import java.util.ArrayList;
import java.util.List;

	public class FakeDateBase {
		
	 private List <User> users = new ArrayList<User>();
	 private List<Book> books = new ArrayList<Book>();
	 public FakeDateBase(){
		 User user1 = new User("Andrey");
		 addUser(user1);
		 User user2 = new User("Timur");
		 addUser(user2);
		 User user3 = new User("Jenia");
		 addUser(user3);
		 Book book1 = new Book("matan","Martynov");
		 addBook(book1);
		 Book book2 = new Book("algebra","Kapulova");
		 addBook(book2);
		 Book book3 = new Book("Funkcionalnyu Analiz","Vuvunikian");
		 addBook(book3);
	 }
		
     public void addBook(Book book){
		this.books.add(book);	
		}
     public void addUser (User user){
		this.users.add(user);
		}
    
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}	
	}


	