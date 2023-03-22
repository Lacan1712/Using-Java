/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.bancoex;
import java.util.Scanner;

/**
 *
 * @author lacan
 */
public class Banco {
   public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        BancoConta conta = new BancoConta();
        String OP="";
        while(!OP.equalsIgnoreCase("5")){
            System.out.println("MENU BANCO EX");
            System.out.println("[1] Para criar sua conta");
            System.out.println("[2] Depósito");
            System.out.println("[3] Sacar");
            System.out.println("[4] Fechar sua conta");
            System.out.println("[5] F11echar menu");
            OP = menu.nextLine();
            switch(OP){
                case "1":
                    conta.abrirConta();
                    break;
                case "2":
                    conta.depositar();
                    break;
                case "3":
                    conta.sacar();
                    break;
                case "4":
                    conta.fecharConta();
                    break;
                default:
                    OP = "5";
            }
        }
    }
}
