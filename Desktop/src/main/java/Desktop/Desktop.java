package Desktop;

import java.util.Arrays;

public abstract class Desktop extends Hardware implements DesktopInterface{
    /*
    Agregrando Classes e instanciando elas como atributos
    Tranformando assim uma classe grande em pequeno pedaços de uma só classe
    Cada classe instanciada tem seus atributos e é extendida à classe Hardware
    */
    private Memoria slot   = new Memoria();
    private HD hd          = new HD();
    private PlacaMae placa = new PlacaMae();
    private Pv pv          = new Pv();
    private String tipoDesktop;
    
    public Memoria getSlot() {
        return slot;
    }

    public void setSlot(Memoria slot) {
        this.slot = slot;
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public PlacaMae getPlaca() {
        return placa;
    }

    public void setPlaca(PlacaMae placa) {
        this.placa = placa;
    }

    public Pv getPv() {
        return pv;
    }

    public void setPv(Pv pv) {
        this.pv = pv;
    }

    public String getTipoDesktop() {
        return tipoDesktop;
    }

    public void setTipoDesktop(String tipoDesktop) {
        this.tipoDesktop = tipoDesktop;
    }
    
    
    @Override
    public void detalhesGeral(){      
        System.out.println("===Detalhes gerais do Desktop==");
        System.out.println("Mémoria: "+this.getSlot().getMarca());
        System.out.println("HD: "+this.getHd().getMarca());
        System.out.println("Placa mãe: "+this.getPlaca().getMarca());
        System.out.println("Placa de vídeo "+this.getPv().getMarca());
    }
    @Override
    public void detalhesMemoria(){
        System.out.println("▬▬▬▬▬Detalhes de Memória Ram▬▬▬▬▬");
        System.out.println("    →Modelo memória: "+this.getSlot().getModelo());
        System.out.println("    →Frenquencia: "+this.getSlot().getFrequencia());
        super.detalhes(slot.getMarcaSlot(),slot.getModeloSlot(),slot.getPesoSlot(),slot.getPrecoSlot(),slot.getCapacidadeSlot(),slot.getMedidasSlot() );
        System.out.println(" ");
        System.out.println(" ");  
    }
    @Override 
    public void detalhesHd(){
        System.out.println("▬▬▬▬▬▬▬▬Detalhes HD▬▬▬▬▬▬▬▬");
        System.out.println("    →Tipo de HD: "+this.getHd().getTipoHD());
        System.out.println("    →Tranferência: "+this.getHd().getTransferencia());
        super.detalhes(hd.getMarcaHd(),hd.getModeloHd(),hd.getPesoHd(),hd.getPrecoHd(),hd.getCapacidadeHd(),hd.getMedidasHd());
        System.out.println(" ");
        System.out.println(" "); 
        
    }
    @Override
    public void detalhesPlacaMae(){
        System.out.println("    →Processador: "+this.getPlaca().getTipoProcessador());
        System.out.println("    →Socket: "+this.getPlaca().getSockete());
        System.out.println("    →Frequência Máxima: "+this.getPlaca().getMaxFrequencia());
        super.detalhes(placa.getMarcaPM(),placa.getModeloPM(),placa.getPesoPM(),placa.getPrecoPM(),placa.getCapacidadePM(),placa.getMedidasPM());
        System.out.println(" ");
        System.out.println(" "); 
        
    }
    @Override
    public void detalhesPlacaVideo(){
        System.out.println("    →GPU: "+this.getPv().getGpu());
        System.out.println("    →GDDR: "+this.getPv().getGddr());
        super.detalhes(pv.getMarcaPv(),pv.getModeloPv(),pv.getPesoPv(),pv.getPrecoPv(),pv.getCapacidade(),pv.getMedidasPv());
        System.out.println(" ");
        System.out.println(" "); 
        
        
    }
}
