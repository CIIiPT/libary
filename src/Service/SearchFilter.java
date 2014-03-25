package Service;

import java.util.ArrayList;

import model.Book;
import model.FakeDateBase;
import model.MediadComment;
public class SearchFilter {
	
	public static ArrayList<Book> SearchbyTitle(String title, FakeDateBase fakeDateBase){
	 
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDateBase.getBooks()) {
			if(book.getTitle().equals(title))
				result.add(book);
		}
		return result;
    }
	
	public static ArrayList<Book> SearchbyAuthor(String author, FakeDateBase fakeDateBase){
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDateBase.getBooks()) {
			if(book.getAuthor().equals(author))
				result.add(book);
		}
			return result;
	}
	public static ArrayList<Book> SearchbyRates(Double rate, FakeDateBase fakeDateBase){
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDateBase.getBooks()){
			double avarage = 0;
			for (MediadComment comment: book.getRates()){
				avarage +=comment.getRate();
			}
			avarage = avarage/book.getRates().size(); 
			if(avarage >= rate){
				result.add(book);
			}
		}
		return result;
	
	}
}
