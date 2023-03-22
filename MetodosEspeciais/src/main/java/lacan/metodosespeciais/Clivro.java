/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.metodosespeciais;

/**
 *
 * @author lacan
 */
public class Clivro {
    //Definindo todas os atributos
    public  int      num_pag = 0;
    private String   autor   = "";
    public  String   assunto = "";
    public  String   cor_cap = "";
    private boolean  box = false;
    protected String editora = "";
    private boolean  aberto  = false;
    private boolean fechado  = true;
    //Método construtor
    public Clivro(){
        this.num_pag = 176;
        this.autor   = "Graciliano Ramos";
        this.assunto = "Vidas Secas";
        this.cor_cap = "Capa marrom";
        this.box     = false;
        this.editora = "Livraria José Olympio Editora";
        this.aberto  = true;
        this.fechado = false;
    }
    //Definindo métodos
    public void status(){
        System.out.println("Número de páginas: " + this.num_pag);
        System.out.println("Autor: " + this.autor);
        System.out.println("Título: " + this.assunto);
        System.out.println("Cor da capa : " + this.cor_cap);
        if(box == false){
            System.out.println("Box: Não");
        }else if(box == true){
            System.out.println("Box: Sim");
        }
        System.out.println("Editora: " + this.editora);
    }
    public int getNum_Pag(){
        return this.num_pag; 
    }
    public void setNum_Pag(int n){
        this.num_pag = n;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAssunto(){
        return this.assunto;
    }
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
    public String getCor_cap(){
        return this.cor_cap;
    }
    public void setCor_cap(String cor_capa){
        this.cor_cap = cor_capa;
    }
    public boolean getBox(){
        return this.box;
    }
    public void setBox(boolean box){
        this.box = box;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
