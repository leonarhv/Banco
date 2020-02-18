/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import users.Usuario;

/**
 *
 * @author leona
 */
public class UsuarioDao {
    
    public void insere(Usuario usuario) {
        Connection con = new ConnectionFactory().getConnection();
        
        String sql = "INSERT INTO usuarios (nome, conta, agencia) values (?, ?, ?)";
                     
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getConta());
            stmt.setInt(3, usuario.getAgencia());
            stmt.execute();
            stmt.close();
            con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
