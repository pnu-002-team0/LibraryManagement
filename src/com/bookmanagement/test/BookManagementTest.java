package com.bookmanagement.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.bookmanagement.BookManagement;

class BookManagementTest {

	@Test
	void testMain() {
		BookManagement book_management = new BookManagement();
		assertNotNull(book_management);
	}

}
