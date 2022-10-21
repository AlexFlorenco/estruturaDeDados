package converterECalcular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String infixa;
        String posfixa;
        Pilha pilha = new Pilha();
        Scanner scan = new Scanner(System.in);

        System.out.print("Expressao Infixa: ");
        infixa = scan.nextLine();

        posfixa = Conversora.conversao(infixa);
        Calculadora.lerPosfixa(posfixa, pilha);

        if (pilha.qtdElementos != 1 && pilha.pilha[pilha.inicio] != Double.valueOf(0)) {
            System.out.println("Operadores insuficientes para o calculo!");
        }

        else {
            if (pilha.qtdElementos != 1) {
                scan.close();
                return;
            }

            else {
                System.out.println("Expressao Posfixa: " + posfixa);
                System.out.print("Resultado: ");
                pilha.peekAll();
            }
        }

        scan.close();
    }
}
