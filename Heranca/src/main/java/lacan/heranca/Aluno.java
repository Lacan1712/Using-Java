package lacan.heranca;


public class Aluno extends Pessoas {
    private int mat;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Matrícula cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
   public void imprimir(){
       super.imprimir();
       System.out.println("Curso: "+getCurso());
       System.out.println("Matricula: "+getMat());
   }

    public Aluno() {
        this.mat = 1231;
        this.curso ="ADS";
    }
    
}
