package com.soprasteria.bestof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Movie;
import com.soprasteria.bestof.model.Song;

@RestController
@RequestMapping("/bestof/*")
public class bestOfController {

	@GetMapping("/movie")
	public Movie restituisciFilm() {
		return new Movie();
	}
	
	@GetMapping("/song")
	public Song restituisciSong() {
		return new Song();
	}
	
	
}
