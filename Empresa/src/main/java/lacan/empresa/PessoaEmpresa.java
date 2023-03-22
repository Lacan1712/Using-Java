package lacan.empresa;

public abstract class PessoaEmpresa extends Pessoa {
    private String funcao;
    private int    salario;
    private int    nivel;

    
    //Métodos especiais
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void aumento(){
        this.setSalario(1);
    }
   
    
}
