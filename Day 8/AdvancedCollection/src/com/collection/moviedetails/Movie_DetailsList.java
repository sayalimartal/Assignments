package com.collection.moviedetails;

import java.util.Iterator;
import java.util.TreeSet;

public class Movie_DetailsList {
	
	public TreeSet<Movie_Details> movies=new TreeSet<>();
	
	public void add_movie(Movie_Details movie)
	{
		movies.add(movie);
		System.out.println(movie);
	}
	
	public void remove_movie(Movie_Details movie)
	{
		movies.remove(movie);
		System.out.println(movie);
	}
	
	public void remove_AllMovies()
	{
		movies.removeAll(movies);
//		System.out.println(movie);
	}
	
	public void find_movie_By_mov_Name(String movieName) 
	{
//		Iterator<Movie_Details> itr=movies.iterator();
//		while(itr.hasNext())
		for(Movie_Details mov:movies) {
			if(mov.getMov_Name().equals(movieName))
				System.out.println(mov);
		}
		
	}
	
	public void find_movie_By_Genre(String genre) 
	{
		for(Movie_Details mov:movies) {
			if(mov.getGenre().equals(genre))
				System.out.println(mov);
		}
	}
	
}
