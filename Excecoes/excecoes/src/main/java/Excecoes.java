import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

  // Método para ler um número inteiro do teclado
  public static int lerInteiro() throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    try {
      int num = sc.nextInt();
      sc.close();
      return num;
    } catch (InputMismatchException e) {
      sc.close();
      throw new Exception("Você digitou uma entrada inválida.");
    }
  }

  public static void main(String[] args) {
    try {
      int num = lerInteiro();
      System.out.println("Você digitou o número: " + num);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}