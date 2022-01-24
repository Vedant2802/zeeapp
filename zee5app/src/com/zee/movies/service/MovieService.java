package com.zee.movies.service;

import com.zee.movies.dto.Register;

public interface MovieService {
	public String addMovie(Register register);
	public Register updateMovie(String id, Register register);
	public Register getMovieById(String id);
	public Register[] getAllMovies();
	public void deleteMovieById(String id);

}


