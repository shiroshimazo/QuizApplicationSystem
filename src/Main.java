/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Database.databaseConnection;
import java.sql.Connection;
/**
 *
 * @author Jeremy
 */
public class Main {

    public static void main(String[] args) {

        Connection connection = databaseConnection.getConnection();

        if (connection != null) {
            System.out.println("Connection is working.");
        } else {
            System.out.println("No connection.");
        }
    }
}
