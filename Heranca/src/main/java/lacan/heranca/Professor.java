package lacan.heranca;


public class Professor extends Pessoas{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum){
        setSalario(salario+=aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public void imprimir(){
        
    }
    
}
