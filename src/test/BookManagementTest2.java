package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BookManagement;

public class BookManagementTest2 {

	@Test
	void testAddBook() {
		BookManagement book_management = new BookManagement();
		assertTrue(book_management.addBook(2));
		assertFalse(book_management.addBook(-1));
	}

	@Test
	void testGetBookCount() {
		BookManagement book_management = new BookManagement();
		assertTrue(book_management.getBookCount()==0);
	}

}
