package com.spring.service.impl;

import com.spring.domain.Movie;
import com.spring.service.MovieService;

public class MovieServiceImpl implements MovieService {

	private String movieName;
	
	private String movieId;
	
	private String movieBudget;
	
	@Override
	public Movie getMovieDetails() {

		Movie movie = new Movie();
		
		movie.setId(movieId);
		movie.setName(this.movieName);
		movie.setBudget(this.movieBudget);
		return movie;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the movieBudget
	 */
	public String getMovieBudget() {
		return movieBudget;
	}

	/**
	 * @param movieBudget the movieBudget to set
	 */
	public void setMovieBudget(String movieBudget) {
		this.movieBudget = movieBudget;
	}

}
