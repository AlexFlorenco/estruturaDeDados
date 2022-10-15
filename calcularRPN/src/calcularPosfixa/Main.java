package calcularPosfixa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String expressao;
		Pilha pilha = new Pilha();
		Scanner scan = new Scanner(System.in);

		System.out.print("Expressao Posfixa: ");
		expressao = scan.nextLine();

		Calculadora.lerPosfixa(expressao, pilha);

		if (pilha.qtdElementos != 1 && pilha.pilha[pilha.inicio] != Double.valueOf(0)) {
			System.out.println("Operadores insuficientes para o calculo!");
		}

		else {
			if (pilha.qtdElementos != 1) {
				scan.close();
				return;
			}

			else {
				System.out.print("Resultado: ");
				pilha.peekAll();
			}
		}

		scan.close();
	}
}
