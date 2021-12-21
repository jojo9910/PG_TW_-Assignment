package com.oopsconcepts.Movie;

import com.oopsconcepts.Movie.Movie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie m1 = new Movie("Casino Royal", "Eon Productions", "PG-13");
        Movie m2 = new Movie("The Ramayana", "Indian studio");

        m2.setMovieRating("R");
        m1.setMovieRating("PG-14");
        System.out.println(m1.getMovieTitle() + " " + m1.getMovieStudio() + " " + m1.getMovieRating());
        System.out.println(m2.getMovieTitle() + " " + m2.getMovieStudio() + " " + m2.getMovieRating());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of movieArray: ");
        int size = sc.nextInt();
        Movie[] movieArray = new Movie[size];

        for (int i = 0; i < size; i++) {
            String randomTitle = getAlphaNumericString(i + 2);
            String randomStudio = getAlphaNumericString(i + 2);
            String randomRating = getAlphaNumericString(i + 2);
            movieArray[i] = new Movie(randomTitle, randomStudio, randomRating);
            System.out.println(movieArray[i].getMovieTitle() + " " + movieArray[i].getMovieStudio() + " " + movieArray[i].getMovieRating());
        }

        System.out.println("filtered pg movies: " + Movie.getPg(movieArray));

    }

    // Java program generate a random AlphaNumeric String
    static String getAlphaNumericString(int length) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder resultantString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            resultantString.append(AlphaNumericString.charAt(index));
        }
        return resultantString.toString();
    }

}