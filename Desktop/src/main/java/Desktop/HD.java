package Desktop;

public class HD extends Hardware{
    private String tipoHD;
    private String transferencia;
    private String marcaHd = this.getMarca();
    private String modeloHd = this.getModelo();
    private double pesoHd = this.getPeso();
    private double[] medidasHd = this.getMedidas();
    private double precoHd = this.getPreco();
    private int capacidadeHd = this.getCapacidade();

    public String getMarcaHd() {
        return marcaHd;
    }

    public void setMarcaHd(String marcaHd) {
        this.marcaHd = marcaHd;
    }

    public String getModeloHd() {
        return modeloHd;
    }

    public void setModeloHd(String modeloHd) {
        this.modeloHd = modeloHd;
    }

    public double getPesoHd() {
        return pesoHd;
    }

    public void setPesoHd(double pesoHd) {
        this.pesoHd = pesoHd;
    }

    public double[] getMedidasHd() {
        return medidasHd;
    }

    public void setMedidasHd(double[] medidasHd) {
        this.medidasHd = medidasHd;
    }

    public double getPrecoHd() {
        return precoHd;
    }

    public void setPrecoHd(double precoHd) {
        this.precoHd = precoHd;
    }

    public int getCapacidadeHd() {
        return capacidadeHd;
    }

    public void setCapacidadeHd(int capacidadeHd) {
        this.capacidadeHd = capacidadeHd;
    }

    
    public String getTipoHD() {
        return tipoHD;
    }

    public void setTipoHD(String tipoHD) {
        this.tipoHD = tipoHD;
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

   
   

    
}
