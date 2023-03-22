
package lacan.buscabinaria;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetor = new int[10002575];
        for(int i = 0;i<vetor.length;i++){
            vetor[i]=i*3;
            System.out.println(vetor[i]);
        }
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        
        System.out.println("Digite o valor a ser buscado: ");
        Scanner ler = new Scanner(System.in);
        int buscado = ler.nextInt();
        while(inicio <= fim){
            meio = (int) (inicio+fim)/2;
            if(vetor[meio] == buscado){
                achou = true;
                break;
            }else if(vetor[meio] < buscado){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        if(achou == true){
            System.out.println("Número achado "+buscado);
        }else{
            System.out.println("Número não listado");
        }
        
    }
}
