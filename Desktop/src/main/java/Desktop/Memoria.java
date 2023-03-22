package Desktop;


public class Memoria extends Hardware{
    /*
     Ao ser instaciada na classe Desktop os atributos específicos para cada classe 
     é definido pelos atributos seguido do nome do objeto.
     */
    int frequencia;
    private String marcaSlot = this.getMarca();
    private String modeloSlot = this.getModelo();
    private double pesoSlot = this.getPeso();
    private double[] medidasSlot = this.getMedidas();
    private double precoSlot = this.getPreco();
    private int capacidadeSlot = this.getCapacidade();

    public String getMarcaSlot() {
        return marcaSlot;
    }

    public void setMarcaSlot(String marcaSlot) {
        this.marcaSlot = marcaSlot;
        this.setMarca(marcaSlot);
    }

    public String getModeloSlot() {
        return modeloSlot;
    }

    public void setModeloSlot(String modeloSlot) {
        this.modeloSlot = modeloSlot;
        this.setModelo(modeloSlot);
    }

    public double getPesoSlot() {
        return pesoSlot;
    }

    public void setPesoSlot(double pesoSlot) {
        this.pesoSlot = pesoSlot;
        this.setPeso(pesoSlot);
    }

    public double[] getMedidasSlot() {
        return medidasSlot;
    }

    public void setMedidasSlot(double[] medidasSlot) {
        this.medidasSlot = medidasSlot;
        this.setMedidas(medidasSlot);
    }

    public double getPrecoSlot() {
        return precoSlot;
    }

    public void setPrecoSlot(double precoSlot) {
        this.precoSlot = precoSlot;
        this.setPreco(precoSlot);
    }

    public int getCapacidadeSlot() {
        return capacidadeSlot;
    }

    public void setCapacidadeSlot(int capacidadeSlot) {
        this.capacidadeSlot = capacidadeSlot;
        this.setCapacidade(capacidadeSlot);
    }
    

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    
    
}
