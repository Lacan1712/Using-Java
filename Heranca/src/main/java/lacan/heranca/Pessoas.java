package lacan.heranca;

public abstract class Pessoas {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario(){
        setIdade(idade++);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    public void imprimir() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());
    }
    
    
}
