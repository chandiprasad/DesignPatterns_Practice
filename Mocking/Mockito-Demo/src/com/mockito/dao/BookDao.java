package com.mockito.dao;

import java.util.Collections;
import java.util.List;
import com.mockito.model.Book;

/**
 * API layer for persisting and retrieving the Book objects.
 */
public class BookDao {

	private static BookDao bookDAL = new BookDao();

	@SuppressWarnings("unchecked")
	public List<Book> getAllBooks() {
		return Collections.EMPTY_LIST;
	}

	public Book getBook(String isbn) {
		return null;
	}

	public String addBook(Book book) {
		return book.getIsbn();
	}

	public String updateBook(Book book) {
		return book.getIsbn();
	}

	public static BookDao getInstance() {
		return bookDAL;
	}
}