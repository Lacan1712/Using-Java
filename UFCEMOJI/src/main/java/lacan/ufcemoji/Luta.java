/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.ufcemoji;

/**
 *
 * @author lacan
 */
public class Luta {
    Lutador desafiante;
    Lutador desafiado;
    private int rouds;
    private boolean aprovada;
    //Métodos publicos
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && l1!=l2){
           this.setAprovada(true);
           this.setDesafiante(l1);
           this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void lutar(){
        
    }
    //Métodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
