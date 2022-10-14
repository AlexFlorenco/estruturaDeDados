package calcularRPN;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String expressao;
		Pilha pilha = new Pilha();
		Scanner scan = new Scanner(System.in);

		System.out.print("RPN: ");
		expressao = scan.nextLine();

		Calculadora.lerRPN(expressao, pilha);
		
		if (pilha.qtdeElementos != 1 && pilha.pilha[pilha.fim] != Double.valueOf(0)) {
			System.out.println("Operadores insuficientes para o calculo!");
		}
		
		else {
			if (pilha.qtdeElementos != 1) {
				scan.close();
				return;
			}
			
			else {
				System.out.print("Resultado: ");
				pilha.peek();

			}
		}

		scan.close();
	}
}
