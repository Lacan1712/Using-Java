/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.empresa;

/**
 *
 * @author lacan
 */
public class Programa {
    public static void main(String[] args){
        Cliente C = new Cliente(123,333,43);
        C.imprimir();
        Funcionario F = new Funcionario();
        F.imprimir();
    }
}
