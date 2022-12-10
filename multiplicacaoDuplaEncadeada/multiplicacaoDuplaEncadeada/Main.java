package multiplicacaoDuplaEncadeada;

import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
    String multiplicador;
    String multiplicando;
    String produto;
    
    System.out.print("Fator Multiplicador: ");
    multiplicador = scan.nextLine();

    System.out.print("Fator Multiplicando: ");
    multiplicando = scan.nextLine();

    produto = Calculadora.multiplicar(multiplicador, multiplicando);

    System.out.println("\n" + multiplicador + " x " + multiplicando + " = " + produto);
  
    scan.close();
  }
}
