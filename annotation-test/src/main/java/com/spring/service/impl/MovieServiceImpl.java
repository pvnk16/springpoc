package com.spring.service.impl;

import org.springframework.stereotype.Component;

import com.spring.domain.Movie;
import com.spring.service.MovieService;

@Component
public class MovieServiceImpl implements MovieService {

	@Override
	public Movie getMovie() {
		Movie movie = new Movie();

		movie.setInfo("Hero:DQ");
		movie.setName("KANMANI");
		return movie;
	}

}
