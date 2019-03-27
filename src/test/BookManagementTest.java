package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BookManagement;

public class BookManagementTest {

	@Test
	public void testAddBook() {
		BookManagement book_management = new BookManagement();
		assertTrue(book_management.addBook(2));
	}
	@Test
	public void testAddBook_False() {
		BookManagement book_management = new BookManagement();
		assertFalse(book_management.addBook(-1));
	}


	@Test
	public void testGetBookCount() {
		BookManagement book_management = new BookManagement();
		assertTrue(book_management.getBookCount()==0);
	}

}
