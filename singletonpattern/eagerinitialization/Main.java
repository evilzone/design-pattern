package com.singletonpattern.eagerinitialization;

public class Main {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();

    }
}
