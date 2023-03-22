package Desktop;

public class PlacaMae extends Hardware {
    String tipoProcessador;
    String sockete;
    String maxFrequencia;
    private String marcaPM = this.getMarca();
    private String modeloPM = this.getModelo();
    private double pesoPM = this.getPeso();
    private double[] medidasPM= this.getMedidas();
    private double precoPM = this.getPreco();
    private int capacidadePM = this.getCapacidade();

    public String getMarcaPM() {
        return marcaPM;
    }

    public void setMarcaPM(String marcaPM) {
        this.marcaPM = marcaPM;
        this.setMarca(marcaPM);
    }

    public String getModeloPM() {
        return modeloPM;
    }

    public void setModeloPM(String modeloPM) {
        this.modeloPM = modeloPM;
        this.setModelo(modeloPM);
    }

    public double getPesoPM() {
        return pesoPM;
    }

    public void setPesoPM(double pesoPM) {
        this.pesoPM = pesoPM;
        this.setPeso(pesoPM);
    }

    public double[] getMedidasPM() {
        return medidasPM;
    }

    public void setMedidasPM(double[] medidasPM) {
        this.medidasPM = medidasPM;
        this.setMedidas(medidasPM);
    }

    public double getPrecoPM() {
        return precoPM;
    }

    public void setPrecoPM(double precoPM) {
        this.precoPM = precoPM;
        this.setPreco(precoPM);
    }

    public int getCapacidadePM() {
        return capacidadePM;
    }

    public void setCapacidadePM(int capacidadePM) {
        this.capacidadePM = capacidadePM;
        this.setCapacidade(capacidadePM);
    }
    
    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public String getSockete() {
        return sockete;
    }

    public void setSockete(String sockete) {
        this.sockete = sockete;
    }

    public String getMaxFrequencia() {
        return maxFrequencia;
    }

    public void setMaxFrequencia(String maxFrequencia) {
        this.maxFrequencia = maxFrequencia;
    }

    
}
