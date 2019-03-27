package main;


public class BookManagement {
	
	private int bookCount = 0;
	
	public static void main(String[] args) {
		System.out.println("Hello!!!!!!!!!!!!!!!");
	}
	
	public boolean addBook(int bookNumber) {
		if(bookNumber>0) {
			bookCount ++;
			return true;
		}
		return false;
	}
	public int getBookCount() {
		return bookCount;
	}
}
