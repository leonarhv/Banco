/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leona
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetobanco?useTimezone=true&serverTimezone=UTC", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
