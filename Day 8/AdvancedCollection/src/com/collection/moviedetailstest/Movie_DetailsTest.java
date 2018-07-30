package com.collection.moviedetailstest;

import com.collection.moviedetails.Movie_Details;
import com.collection.moviedetails.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		
		Movie_DetailsList movieList=new Movie_DetailsList();
		Movie_Details movie=new Movie_Details("abcc","asd","dsft","cdfr");
		Movie_Details movie1=new Movie_Details("fvsdv","asd","dsft","cythdfr");
		Movie_Details movie2=new Movie_Details("htn","asd","dsft","cdfuyjr");
		Movie_Details movie3=new Movie_Details("abcgbuyc","asd","dsft","cdfujiir");
		movieList.add_movie(movie);
		movieList.add_movie(movie1);
		movieList.add_movie(movie2);
		movieList.add_movie(movie3);
		
		movieList.find_movie_By_Genre("cdfr");

	}

}
