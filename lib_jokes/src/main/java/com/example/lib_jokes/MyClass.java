package com.example.lib_jokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyClass {
    List<String> Jokes = Arrays.asList(
            "Q. What is the biggest lie in the entire universe? - I have read and agree to the Terms & Conditions.",
            "Q. How does a computer get drunk? - It takes screenshots.",
            "Q: Why was the cell phone wearing glasses? - It lost its contacts.",
            "Q. What do you call it when you have your mom’s mom on speed dial? - Instagram.",
            "Q. Did you hear about the crook who stole a calendar? - He got twelve months.",
            "Q. Why is Daly City always Foggy? - A lot of people are cooking Rice there."
    );

    public String getJokes(){
        Random rand = new Random();
        String rand_joke = Jokes.get(rand.nextInt(Jokes.size()));
        return rand_joke;
    }
}
