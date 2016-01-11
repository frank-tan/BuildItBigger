package com.franktan.builditbigger.backend;

import com.franktan.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

//    private String myData;

    public String getData() {
        return JokeTeller.tellJoke();
    }

//    public void setData(String data) {
//        myData = data;
//    }
}