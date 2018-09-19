package com.spring.service.impl;

import com.spring.domain.Book;
import com.spring.service.BookService;

public class BookServiceImpl implements BookService {

	public BookServiceImpl() {
		System.out.println("BookServiceImpl::new");
	}

	private String bookId;

	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	private String bookName;

	private String bookTitle;

	/*
	 * Method to get book.(non-Javadoc)
	 * 
	 * @see com.spring.service.BookService#getBook()
	 */
	@Override
	public Book getBook() {
		Book book = new Book();

		book.setName(this.bookName);
		book.setTitle(this.bookTitle);
		book.setPrice(this.bookId);

		return book;
	}

}
