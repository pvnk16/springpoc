package com.spring.controller;

import com.spring.domain.Movie;
import com.spring.service.MovieService;

public class MovieController {

	private MovieService movieService;
	
	public Movie getMovie() {
		
		return this.movieService.getMovieDetails();
	}

	/**
	 * @return the movieService
	 */
	public MovieService getMovieService() {
		return movieService;
	}

	/**
	 * @param movieService the movieService to set
	 */
	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}
	
}
