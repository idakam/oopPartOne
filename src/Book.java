
public class Book {
	private String title;
	private String author;
	private Integer pages;
	
	//Empty Constructor
	public Book() {
		title = "Title of Book";
		author = "Author of Book";
		pages = 0;
	}
	
	//Constructor with two variables
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//Constructor with all variables
	public Book(String title, String author, Integer pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Integer getPages() {
		return pages;
	}
	
	//Setters
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public void setPages(Integer newPages) {
		this.pages = newPages;
	}
	
	//Boolean Method
	public boolean isFullLengthNovel() {
		if(this.pages > 100) {
			return true;
		}
		return false;
	}
	
	//String Method
	public String toString() {
		return "Title: " + this.title + "Author: " + this.author + "Number of Pages: " + String.valueOf(this.pages);
	}
	
}

