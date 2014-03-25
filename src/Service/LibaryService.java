package Service;

import model.Book;
import model.MediadComment;
import model.User;

public interface LibaryService {

	public void addcomment(User user, Book book, MediadComment comment);
	public void addUser(User user);
	public void addBook(Book book);
	public User findUser(String name);
	public Book findBook(String title);
	
}
