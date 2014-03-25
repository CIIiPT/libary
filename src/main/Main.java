package main;



import java.util.ArrayList;

import Service.FakeLibaryService;
import Service.LibaryService;
import Service.SearchFilter;
import model.Book;
import model.FakeDateBase;
import model.MediadComment;
import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibaryService ls = new FakeLibaryService();
	    User user = ls.findUser("Andrey"); //симул€ци€ входа в систему
	    Book book = ls.findBook("matan");
		MediadComment mediadcomment1 = new MediadComment();
		mediadcomment1.setComment("klass");
		mediadcomment1.setUser(user);
		mediadcomment1.setRate(5.0);
		ls.addcomment(user, book, mediadcomment1);
		
		/*
		ArrayList<Book> resultAuthor = SearchFilter.SearchbyAuthor("Martynov",fdb);
		ArrayList<Book> resultTitle = SearchFilter.SearchbyTitle("matan",fdb);*/

	}
	

}
