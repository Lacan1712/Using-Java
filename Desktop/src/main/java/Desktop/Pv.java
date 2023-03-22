package Desktop;

public class Pv extends Hardware{
    private String gpu;
    private String gddr;
    private String marcaPv = this.getMarca();
    private String modeloPv = this.getModelo();
    private double pesoPv = this.getPeso();
    private double[] medidasPv = this.getMedidas();
    private double precoPv = this.getPreco();
    private int capacidadePv = this.getCapacidade();

    public String getMarcaPv() {
        return marcaPv;
    }

    public void setMarcaPv(String marcaPv) {
        this.marcaPv = marcaPv;
        this.setMarca(marcaPv);
    }

    public String getModeloPv() {
        return modeloPv;
    }

    public void setModeloPv(String modeloPv) {
        this.modeloPv = modeloPv;
        this.setModelo(modeloPv);
    }

    public double getPesoPv() {
        return pesoPv;
    }

    public void setPesoPv(double pesoPv) {
        this.pesoPv = pesoPv;
        this.setPeso(pesoPv);
    }

    public double[] getMedidasPv() {
        return medidasPv;
    }

    public void setMedidasPv(double[] medidasPv) {
        this.medidasPv = medidasPv;
        this.setMedidas(medidasPv);
    }

    public double getPrecoPv() {
        return precoPv;
    }

    public void setPrecoPv(double precoPv) {
        this.precoPv = precoPv;
        this.setPreco(precoPv);
    }

    public int getCapacidadePv() {
        return capacidadePv;
    }

    public void setCapacidadePv(int capacidadePv) {
        this.capacidadePv = capacidadePv;
        this.setCapacidade(capacidadePv);
    }
    
    
    
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getGddr() {
        return gddr;
    }

    public void setGddr(String gddr) {
        this.gddr = gddr;
    }

  
    
}
