/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.heranca;
import java.util.Random;

/**
 *
 * @author lacan
 */
public abstract class PessoaEmpresa extends Pessoas{
    Random numId = new Random();
    int ID = numId.nextInt(2000-1000+1)+1000;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
            
}
