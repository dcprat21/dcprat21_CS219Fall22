package Exam2;

import RecursionExamples.Recursion;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {
    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }

        if(words.length <= 1 ){
           return words;
            }
        else if (words.length() - 1 == words.length(0)) &&
                load_words(words.(1 , words.length( - 1))){
            return words;

        }
            return words;
    }
    public static void main(String [] args){
        for (int i = 0; i < args.length/2; i++)){
            int temp = args[i];
            args[i] = args[args.length - 1 -i];
            args[args.length -1 - i] = temp;
        }
        System.out.println(load_words());

    }
}
