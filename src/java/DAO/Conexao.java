/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 2017000879
 */
public class Conexao {
    public static Connection getConnection(){
        
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/loja", "postgres", "ciet");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
