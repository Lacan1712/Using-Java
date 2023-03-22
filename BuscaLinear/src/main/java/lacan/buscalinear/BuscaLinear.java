package lacan.buscalinear;
import java.util.Scanner;
public class BuscaLinear {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        for(int i=0;i<8;i++){
            vetor[i] = (int)(Math.random()*10);
            System.out.println(vetor[i]);
        }
        System.out.println("Digite sua busca: ");
        Scanner ler = new Scanner(System.in);
        int busca = ler.nextInt();
        boolean achou = false;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i] == busca){
                achou = true;
            }       
        }
        if(achou == true){
            System.out.println("Número encontrado "+busca);
        }else{
           System.out.println("Numero não listado");
        }
    }
}
