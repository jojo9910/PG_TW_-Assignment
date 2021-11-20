package com.OOPSconcepts;

import java.util.ArrayList;

public class Movie {
    private String movieTitle;
    private String movieStudio;
    private String movieRating;

    public Movie(String movieTitle, String movieStudio, String movieRating){
        this.movieTitle=movieTitle;
        this.movieStudio=movieStudio;
        this.movieRating=movieRating;
    }

    public Movie(String movieTitle, String movieStudio){
        this.movieTitle=movieTitle;
        this.movieStudio=movieStudio;
        this.movieRating="PG-4";
    }

    public void setMovieTitle(String movieTitle){
        this.movieTitle=movieTitle;
    }
    public void setMovieStudio(String movieStudio){
        this.movieStudio=movieStudio;
    }
    public void setMovieRating(String movieRating){
        this.movieRating=movieRating;
    }
    public String getMovieTitle(){
        return this.movieTitle;
    }
    public String getMovieStudio(){
        return this.movieStudio;
    }
    public String getMovieRating(){
        return this.movieRating;
    }

    public static ArrayList<Movie> getPg(Movie []movieArray){
        ArrayList<Movie> pgMovies=new ArrayList<>();
        for(int i=0;i<movieArray.length;i++){
            if(movieArray[i].movieRating.startsWith("PG")){
                pgMovies.add(movieArray[i]);
            }
        }
      return pgMovies;
    }
}
