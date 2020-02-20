/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.dao;

import database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import users.Usuario;

/**
 *
 * @author leona
 */
public class UsuarioDao {
    
    Connection con;

    public UsuarioDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    
    public void insere(Usuario usuario) {
        
        String sql = "INSERT INTO usuarios (nome, conta, agencia) values (?, ?, ?)";
                     
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getConta());
            stmt.setInt(3, usuario.getAgencia());
            stmt.execute();
            stmt.close();
            this.con.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Usuario> getLista() {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM usuarios");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setAgencia(rs.getInt("agencia"));
                usuario.setConta(rs.getString("conta"));
                usuarios.add(usuario);
            }
            
            rs.close();
            stmt.close();
            this.con.close();
            return usuarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
