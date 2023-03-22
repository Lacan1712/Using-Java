/**
 *Super classe Hardware que será instanciada em Desktop seguindo assim o relacionamento de agregração
 * suas classes filhas são Memória,HD,PlacaMae,Desktop e Pv(placa de vídeo)
 * todas elas herdarão os atributos e métodos da classe Hardware 
 * @author lacan
 */

package Desktop;


public abstract class Hardware{
    private String marca;
    private String modelo;
    private double peso;
    private double medidas[] = new double[2];
    private double preco;
    private int capacidade;

    //Métodos Especiais
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double[] getMedidas() {
        return medidas;
    }

    public void setMedidas(double[] medidas) {
        this.medidas = medidas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    /**
     * Método que mostra os detalhes de hardware de cada classe onde cada classe tem os atributos
     * da super classe mas específicos para cada classe.
     * @param marca 
     * @param modelo
     * @param peso
     * @param preco
     * @param capacidade
     * @param medidas 
     */
    public void detalhes(String marca, String modelo, double peso, double preco, int capacidade,double[] medidas) {
        this.marca = marca;  System.out.println("Marca: "+this.getMarca());
        this.modelo = modelo;System.out.println("Modelo: "+this.getModelo());
        this.peso = peso;    System.out.println("Peso: "+this.getPeso());
        this.preco = preco;  System.out.println("Preço "+this.getPreco());
        this.capacidade = capacidade; System.out.println("Capacidade: "+this.getCapacidade());
        this.medidas = medidas; System.out.println("Medidas: Lx "+this.medidas[1]+",Ax "+this.medidas[2]);
    }
    
   
}
