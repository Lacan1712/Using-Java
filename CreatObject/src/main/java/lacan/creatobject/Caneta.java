
package lacan.creatobject;

public class Caneta {
    public String modelo = "Bic";
    public String cor = "Preta";
    private double ponta = 0.5;
    protected int carga = 5;
    protected boolean tampada = false;
    
    void status(){
        System.out.println("Modelo "+this.modelo);
        System.out.println("cor "+this.cor);
        System.out.println("ponta "+this.ponta);
        System.out.println("carga "+this.carga);
        System.out.println("tampada:"+this.tampada);
    }
    
    public void rabiscar(){
        if(tampada == false){
            System.out.println("RABISCANDO");
        }else if(tampada == true){
            System.out.println("NÂO POSSO RABISCAR");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
