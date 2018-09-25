package com.spring.service.impl;

import org.springframework.stereotype.Service;

import com.spring.domain.Book;
import com.spring.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Book getBookInfo() {
		Book book = new Book();
		book.setAuthor("michle dougless");
		book.setName("book1");
		return book;

	}

}
