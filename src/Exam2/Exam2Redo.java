package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;

public class Exam2Redo {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1){
            return true;
        }

        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome(s.substring(1, s.length() - 1))){
            return true;
        }
        else {
            return false;
        }
    }
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
            String t = s.nextLine();
            // check to see if it's a palindrome
            if  (isPalindrome(t)){
                words[i++] = t;
            }
            // if it is a palindrome, put it in words array

        }
        return words;

    }

    public static void main(String[] args) {

        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9);
        // Creating new int n to get the entire length of words
        int n = words.length;
        // Creating a 2nd word in order to create the array in reverse
        String [] words2 = new String[n];

        // For loop to reverse the array
        for (int i = 0; i < words.length; i++){
            // Reversing the array
            words2[i] = words[words.length- 1 - i];
        }

        System.out.println(Arrays.toString(words2));



        // print the array in reverse using the for loop


    }
}


