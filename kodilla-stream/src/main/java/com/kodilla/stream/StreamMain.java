package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Decorating text with some beautifiers using lambda" + "\n");

        poemBeautifier.beautify("Java is demanding",
                (textToDecorate -> textToDecorate.toUpperCase()));
        poemBeautifier.beautify("Learning Java is slow but exciting",
                (textToDecorate -> textToDecorate.toUpperCase()));
        poemBeautifier.beautify("Java is demanding",
                (textToDecorate -> "ABC- " + textToDecorate + " -ABC"));
        poemBeautifier.beautify("Learning Java is slow but exciting",
                (textToDecorate -> "-*_ " + textToDecorate + " _*-"));
        poemBeautifier.beautify("What To TYPE?",
                (textToDecorate -> textToDecorate.toLowerCase()));
        poemBeautifier.beautify("What to type?",
                (textToDecorate -> textToDecorate.replaceAll(" ", "_")));
    }
}
