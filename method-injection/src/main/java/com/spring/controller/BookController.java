
package com.spring.controller;

import com.spring.domain.Book;
import com.spring.service.BookService;

/**
 * Class that gives operations to manage book information.
 * @author Pavan
 *
 */
public class BookController {
	
	public BookController() {
		System.out.println("BookController::new");
	}
	
	/**
	 * @return the bookService
	 */
	public BookService getBookService() {
		return bookService;
	}



	/**
	 * @param bookService the bookService to set
	 */
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	private BookService bookService;
	
	
	
	public Book getBookInfo() {
		return this.bookService.getBook();
	}

}
