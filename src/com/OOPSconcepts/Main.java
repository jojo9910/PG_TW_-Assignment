package com.OOPSconcepts;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main( String []args){

        Movie m1=new Movie("Casino Royal","Eon Productions","PG-13");
        Movie m2=new Movie("The Ramayana","Indian studio");

        m2.setMovieRating("R");
        m1.setMovieRating("PG-14");
        System.out.println(m1.getMovieTitle()+" "+m1.getMovieStudio()+" "+m1.getMovieRating());
        System.out.println(m2.getMovieTitle()+" "+m2.getMovieStudio()+" "+m2.getMovieRating());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of movieArray: ");
        int size=sc.nextInt();
        Movie [] movieArray=new Movie[size];

        for(int i=0;i<size;i++){
            String randomMovieTitle=getAlphaNumericString(5);
            String randomMovieStudio=getAlphaNumericString(6);
            String randomMovieRating=getAlphaNumericString(5);
            movieArray[i]=new Movie(randomMovieTitle,randomMovieStudio,randomMovieRating);
            System.out.println(movieArray[i].getMovieTitle()+" "+movieArray[i].getMovieStudio()+" "+movieArray[i].getMovieRating());
        }

        System.out.println("filtered pg movies: "+Movie.getPg(movieArray));


    }

    // Java program generate a random AlphaNumeric String
// using CharSet method
    static String getAlphaNumericString(int lengthOfString) {

        // length is bounded by 256 Character
        byte[] array = new byte[256];
        new Random().nextBytes(array);

        String randomString = new String(array, StandardCharsets.UTF_8);

        StringBuilder resultantString= new StringBuilder();

        // Append first 20 alphanumeric characters
        // from the generated random String into the result
        for (int k = 0; k < randomString.length(); k++) {

            char ch = randomString.charAt(k);

            if (((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || (ch >= '0' && ch <= '9'))
                    && (lengthOfString > 0)) {

                resultantString.append(ch);
                lengthOfString--;
            }
        }
        return resultantString.toString();
    }

}