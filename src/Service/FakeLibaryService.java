package Service;

import model.Book;
import model.FakeDateBase;
import model.MediadComment;
import model.User;

public class FakeLibaryService implements LibaryService{
	private FakeDateBase fdb;  
	public FakeLibaryService(){
		fdb = new FakeDateBase();
	}
	@Override
	public void addcomment(User user, Book book, MediadComment comment) {
		// TODO Auto-generated method stub
		
		for (Book book1 : fdb.getBooks()) {
			if (book1==book){
				book1.addComment(comment);
				break;
			}
			
		}
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		fdb.addUser(user);
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		fdb.addBook(book);
		
	}
	@Override
	public User findUser(String name) {
		// TODO Auto-generated method stub
		for (User user : fdb.getUsers()) {
			if (user.getName().equals(name)){
				return user;
			}
		}
		return null;
	}
	@Override
	public Book findBook(String title) {
		// TODO Auto-generated method stub
		for (Book book : fdb.getBooks()) {
			if (book.getTitle().equals(title)){
				return book;
			}
		    
		}
		return null;
	}
	

}
