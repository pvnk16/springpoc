package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.spring.domain.Song;
import com.spring.service.SongService;

@Service
@PropertySource(value = "classpath:queries.properties")
public class SongServiceImpl implements SongService {
	
	@Autowired
	private Environment environment;
	

	@Override
	public Song getSongDetails() {
		Song song = new Song();
		song.setName(environment.getProperty("name"));
		song.setLenght("44");
		return song;
	}

}
