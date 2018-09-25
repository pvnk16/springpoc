package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.domain.Book;
import com.spring.service.BookService;

@Component
public class BookController {

	@Autowired
	private BookService bookService;

	public Book getBook() {
		return this.bookService.getBookInfo();
	}
}
