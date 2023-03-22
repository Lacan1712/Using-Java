/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.lista;

/**
 *
 * @author lacan
 */
public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo;
    
    public Elemento(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}