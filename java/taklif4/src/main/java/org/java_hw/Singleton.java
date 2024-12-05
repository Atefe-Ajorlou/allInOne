//package org.example;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Logger;
//
//public class ConnectionManager{
//    private static final Logger log = Logger.getLogger(ConnectionManager.class.getName());
//
//    private static Connection connection;
//
//    private ConnectionManager() {
//    }
//
//    public static Connection getConnection() {
//        if (connection == null) {
//            try {
//                connection =
//                        DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
//            } catch (SQLException e) {
//                throw new RuntimeException("can not connect to database",e);
//            }
//        }
//        return connection;
//    }
//}