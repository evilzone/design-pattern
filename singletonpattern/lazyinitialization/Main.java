package com.singletonpattern.lazyinitialization;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();

    }
}
