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
public class Cliente extends Pessoa {
    int numPedido;
    int numCliente;
    int precoPedido;
    
    
    public void imprimir(){
        super.imprimir();
        System.out.println(numPedido);
        System.out.println(numCliente);
        System.out.println(precoPedido);
}

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(int precoPedido) {
        this.precoPedido = precoPedido;
    }

    public Cliente(int numPedido, int numCliente, int precoPedido) {
        this.numPedido = numPedido;
        this.numCliente = numCliente;
        this.precoPedido = precoPedido;
    }
    
}
