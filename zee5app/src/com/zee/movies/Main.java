package com.zee.movies;

import java.util.ArrayList;

import com.zee.movies.dto.*;
import com.zee.movies.service.*;
import com.zee.movies.service.impl.MovieServiceImpl;
import com.zee.movies.service.impl.*;
import com.zee.movies.repository.*;
public class Main {

	public static void main(String[] args) {
		// Register
		String a[]= {"arpit","arpan"};
		Register register=new Register();
		register.setName("Raaz");
		register.setReleaseDate("24-01-1996");
		register.setCast(a);
		register.setCountry("India");
		register.setId("in001");
		System.out.println(register);
		System.out.println(register.toString());
		System.out.println(register.getCast());
		
		
		MovieService service = MovieServiceImpl.getInstance();
		for(int i=0;i<=11;i++) {
			Register register2=new Register();
			register2.setName("Raaz"+i);
			register2.setReleaseDate("24-01-1996"+i);
			register2.setCast(a);
			register2.setCountry("India"+i);
			register2.setId("in001"+i);	
			
		String result=service.addMovie(register2);
		System.out.println(result);
		}
		
		Register register2=service.getMovieById("in0010");
		System.out.println(register2!=null);
		
		for(Register register3:service.getAllMovies()) {
			System.out.println(register3);
		}
		String id="in0011";
		String b[]= {"rajiv","arpan"};
		Register register4=new Register();
		register4.setName("Aparichit");
		register4.setReleaseDate("15-03-2016");
		register4.setCast(b);
		register4.setCountry("India");
		register4.setId("v");
		Register register5=service.updateMovie(id,register4);
		System.out.println(register5);
		service.deleteMovieById("in0013");
		MovieRepository repository= null;
		

	}

}


