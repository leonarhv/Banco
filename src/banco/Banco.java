/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;
import view.Telas;

/**
 *
 * @author leona
 */
public class Banco {

    public static void main(String[] args) {
        int resp = 0;
        Scanner leia = new Scanner(System.in);
        
        while (resp != 3) {
            Telas.telaPrincipal();
            resp = leia.nextInt();
            if (resp == 1) {
                Telas.cadastro();
            }
            else if (resp == 2) {
                Telas.verUsuarios();
            }
        }
                
    }
    
}
