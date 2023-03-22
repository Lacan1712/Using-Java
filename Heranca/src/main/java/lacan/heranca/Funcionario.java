package lacan.heranca;


public class Funcionario extends PessoaEmpresa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        setTrabalhando(!this.trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public Funcionario(){
         
    }
    
}
