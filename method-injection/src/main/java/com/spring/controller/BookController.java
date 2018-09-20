
package com.spring.controller;

import org.springframework.context.ApplicationContext;

import com.spring.domain.Book;
import com.spring.service.BookService;
import com.spring.service.impl.BookServiceImpl;

/**
 * Class that gives operations to manage book information.
 * 
 * @author Pavan
 *
 */
public class BookController {

	private ApplicationContext context;

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
	public BookServiceImpl setBookService() {
		return null;

	}

	private BookService bookService;

	public Book getBookInfo() {
		this.bookService = setBookService();
		return this.bookService.getBook();
	}

}
