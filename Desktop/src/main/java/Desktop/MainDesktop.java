/**
 * Classe da aplicação, referente ao relacionamento de agregação de classes
 * 
 */
package Desktop;

/**
 *
 * @author lacan
 */
public class MainDesktop{
    public static void main(String[] args) {    
        NoteBook n = new NoteBook();
        NoteBook n1 = new NoteBook();
        n1.getSlot().setMarcaSlot("Bla blá");
        n.getSlot().setMarcaSlot("Asus");
        String marcaH1 = n1.getSlot().getMarca();
        System.out.println(marcaH1);
        String marcaH = n.getSlot().getMarca();
        System.out.println(marcaH);
    }
}
