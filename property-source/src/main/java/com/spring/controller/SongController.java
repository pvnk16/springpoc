package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.domain.Song;
import com.spring.service.SongService;

@Component
public class SongController {

	@Autowired
	private SongService songService;
	
	public Song getSongDetails() {
		return this.songService.getSongDetails();
	}
	
}
