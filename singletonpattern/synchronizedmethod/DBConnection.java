package com.singletonpattern.synchronizedmethod;

public class DBConnection {

    private static DBConnection dbConnection;
    private DBConnection() {}

    synchronized public static DBConnection getInstance() {
        if(dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
