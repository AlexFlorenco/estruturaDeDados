package converterInfixa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String infixa;
		String posfixa;
		Scanner scan = new Scanner(System.in);

		System.out.print("Expressao Infixa: ");
		infixa = scan.nextLine();

		posfixa = Conversora.conversao(infixa);
		
		System.out.println("Expressao Posfixa: " + posfixa);
		
		scan.close();
	}
}
