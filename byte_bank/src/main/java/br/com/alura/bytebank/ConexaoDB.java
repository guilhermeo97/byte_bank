package br.com.alura.bytebank;

import java.sql.*;

public class ConexaoDB {
    public static void main(String... x) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=gui");
            System.out.println("Conexão estabelecida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
        
}
