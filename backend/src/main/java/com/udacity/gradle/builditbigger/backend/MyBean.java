package com.udacity.gradle.builditbigger.backend;

import com.example.lib_jokes.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new MyClass().getJokes();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}