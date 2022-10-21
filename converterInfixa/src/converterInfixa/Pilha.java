package converterInfixa;

public class Pilha {
	Integer inicio;
	Integer fim;
	int tamanho;
	int qtdElementos;
	double pilha[];
	
	public Pilha() {
		fim = inicio = null;
		tamanho = 200;
		pilha = new double[tamanho];
		qtdElementos = 0;
	}

	public void push(double item) {
		if (!isFull()) {
			if (fim == null || inicio == null) {
				fim = 0;
				inicio = 0;
				pilha[inicio] = item;
				qtdElementos++;
			}
			
			else {
				inicio++;
				pilha[inicio] = item;
				qtdElementos++;
			}
		}
	}
	
	public double pop() {
		double topo = pilha[inicio];
		
		if (!isEmpty()) {
			if (qtdElementos == 1) {
				pilha[inicio] = 0;
				fim = null;
				inicio = null;
				qtdElementos--;
			}
			
			else {
				pilha[inicio] = 0;
				inicio--;
				qtdElementos--;
			}
		}
		
		return topo;
	}
	
	public boolean isFull() {
		if (qtdElementos == tamanho - 1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		if (qtdElementos == 0) {
			return true;
		}
		
		return false;
	}

	public int size() {
		return qtdElementos;
	}
	
	public double peek() {
		return pilha[inicio];
	}
	
	public void peekAll() {
		String elementos = "";
		
		for (int i = fim; i <= inicio; i++) {
			elementos += pilha[i] + " ";
		}
		
		System.out.println(elementos);
	}
}
