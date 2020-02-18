/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import database.ConnectionFactory;
import database.dao.UsuarioDao;
import java.sql.Connection;
import java.sql.SQLException;
import users.Usuario;

/**
 *
 * @author leona
 */
public class Banco {

    public static void main(String[] args) throws SQLException {
        view.Telas.telaPrincipal();
        
        Usuario bob = new Usuario();
        bob.setNome("Bob");
        bob.setAgencia(2);
        bob.setConta("1234-05");
        
        UsuarioDao dao = new UsuarioDao();
        dao.insere(bob);
        
    }
    
}
