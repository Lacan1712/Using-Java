package lacan.empresa;

public abstract class Pessoa { //Classe abstrata que não pode ser instaciada
    private String  nome,tel,id,reclamação;
    private boolean sexo;
    private int     idade;
    
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getSexo() {
       return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Métodos da classe
    public void imprimir(){
        System.out.println("Idade: "+getIdade());
        if(this.sexo == true){
            System.out.println("Sexo: Feminino");
        }else{
            System.out.println("Sexo: Masculino");
        }
        System.out.println("ID: "+getId());
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTel());
    }

    public Pessoa() {
        this.nome = "Sofa";
        this.tel = "9156541";
        this.id = "134";
        this.reclamação = "nenhuma";
        this.sexo = true;
        this.idade = 23;
    }

    
}
