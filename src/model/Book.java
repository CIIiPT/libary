package model;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private String author;
	private int year;
	private String filename;
	private int count;
	private List <String> genre;
	private List <MediadComment> rates = new ArrayList<MediadComment>();
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	public void addComment(MediadComment comment){
		rates.add(comment);
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public List<MediadComment> getRates() {
		return rates;
	}

	public void setRates(List<MediadComment> rates) {
		this.rates = rates;
	}
	
}
