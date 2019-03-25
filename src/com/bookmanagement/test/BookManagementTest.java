package com.bookmanagement.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.bookmanagement.BookManagement;

class BookManagementTest {

	@Test
	void testAddBook() {
		BookManagement book_management = new BookManagement();
		assertTrue(book_management.addBook(2));
		assertFalse(book_management.addBook(-1));
		assertTrue(book_management.getBookCount()==1);
	}

}
