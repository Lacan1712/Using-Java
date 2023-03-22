/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacan.ufcemoji;

/**
 *
 * @author lacan
 */
public class Lutador implements InterfaceImoji{
    //Atributos
    private String nome,nacionalidade,categoria;
    private double altura,peso;
    private int idade,vitoria,empates,derrotas;
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso<52){
            this.categoria = "Inválido";
        }else if(this.peso<=70){
            this.categoria = "Peso Leve";
        }else if(this.peso<=83.9){
            this.categoria = "Peso Médio";
        }else if(this.peso<=129.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria ="Inválido";
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    @Override
    public void apresentar(){
        System.out.println("APRESENTANDO UFC COMBATE EMOJI!!!");
        System.out.println("Nesse momento com " + getIdade());
        System.out.println("O lutador " + getNome()+" pesando "+getPeso()+" e medindo "+getAltura());
        System.out.println("Na "+getCategoria()+" com "+getVitoria()+" vitórias, " +getDerrotas()+" derrotas e "+getEmpates()+" empates ");
    }

    @Override
    public void status() {
        System.out.println("Cadastro de lutador");
        System.out.println(getNome());
        System.out.println("Peso "+getPeso());
        System.out.println(getVitoria()+" vitoria");
        System.out.println(getEmpates()+" empates");
        System.out.println(getDerrotas()+" derrotas");
    }

    @Override
    public void ganharLuta() {
        setVitoria(getVitoria()+1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getVitoria()+1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }   
}
