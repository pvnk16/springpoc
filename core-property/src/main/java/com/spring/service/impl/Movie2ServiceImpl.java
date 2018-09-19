package com.spring.service.impl;

import com.spring.domain.Movie;
import com.spring.service.MovieService;

public class Movie2ServiceImpl implements MovieService {

	
	@Override
	public Movie getMovieDetails() {

		Movie movie = new Movie();
		
		movie.setId("1");
		movie.setName("movie2");
		
		movie.setBudget("12");
		
		return movie;
	}

}
