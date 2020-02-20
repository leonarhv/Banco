/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.dao.UsuarioDao;
import java.util.Scanner;
import users.Usuario;

/**
 *
 * @author leona
 */
public class Telas {
    public static void telaPrincipal() {
        System.out.println("--------------------------------");
        System.out.println("Bem vindo ao banco XPTO");
        System.out.println("--------------------------------");
        System.out.println("\n\n\n");
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Lista de usuários do banco");
        System.out.println("3 - Sair");
    }
    
    public static void cadastro() {
        Scanner leia = new Scanner(System.in);
        UsuarioDao dao = new UsuarioDao();
        
        System.out.println("--------------------------");
        System.out.println("Cadastro");
        System.out.println("--------------------------");
        System.out.println("\n");
        Usuario usuario = new Usuario();
        System.out.println("Digite o nome do usuário");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe a conta do usuário");
        usuario.setConta(leia.nextLine());
        System.out.println("Informe o número da agência");
        usuario.setAgencia(leia.nextInt());
        
        dao.insere(usuario);
    }
}
