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
public class Funcionario extends PessoaEmpresa{
    int numVenda;
    String reputacao;
    @Override
    public void aumento(){
        this.setSalario(1);
    }
    public void imprimir(){
        System.out.println("asdkajsd");
    }
}
