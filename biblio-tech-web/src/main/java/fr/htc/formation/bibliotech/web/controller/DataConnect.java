package fr.htc.formation.bibliotech.web.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {

        private static String userName = "htc_formation";
        private static String hostname = "37.59.96.2";
        private static String password = "htc_formation";
        private static String dbname = "htc_formation";
        private static int port = 5432;

        public static Connection getConnection() {

                Connection connection = null;
                try {

                        Class.forName("org.postgresql.Driver");
                        connection = DriverManager.getConnection("jdbc:postgresql://" + hostname + ":" + port + "/" + dbname,
                                        userName, password);

                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
                }

                return connection;
        }

    	public static void close(Connection con) {
    		try {
    			con.close();
    		} catch (Exception ex) {
    		}
    	}
}


