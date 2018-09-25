package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.spring.domain.Movie;
import com.spring.service.MovieService;

@Component
public class MovieController {

	private MovieService movieService;

	/**
	 * @return the movieService
	 */
	public MovieService getMovieService() {
		return movieService;
	}

	/**
	 * @param movieService the movieService to set
	 */
	@Required
	@Autowired
	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	public Movie getMovieDetails() {
		return this.movieService.getMovie();
	}

}
