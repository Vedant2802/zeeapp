package com.zee.movies.repository;

import com.zee.movies.dto.*;



public interface MovieRepository {
	public String addMovie(Register register);
	public Register updateMovie(String id, Register register);
	public Register getMovieById(String id);
	public Register[] getAllMovies();
	public void deleteMovieById(String id);
	

}

