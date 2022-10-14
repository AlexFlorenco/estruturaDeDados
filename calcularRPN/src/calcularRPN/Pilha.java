package calcularRPN;

public class Pilha {
	Integer inicio;
	Integer fim;
	int tamanho;
	int qtdeElementos;
	double pilha[];
	
	public Pilha() {
		inicio = fim = null;
		tamanho = 200;
		pilha = new double[tamanho];
		qtdeElementos = 0;
	}

	public void push(double a) {
		if (!isFull()) {
			if (inicio == null || fim == null) {
				inicio = 0;
				fim = 0;
				pilha[fim] = a;
				qtdeElementos++;
			}
			
			else {
				fim++;
				pilha[fim] = a;
				qtdeElementos++;
			}
		}
	}
	
	public double pop() {
		double item = pilha[fim];
		
		if (!isEmpty()) {
			if(qtdeElementos == 1) {
				pilha[fim] = 0;
				inicio = null;
				fim = null;
				qtdeElementos--;
			}
			
			else {
				pilha[fim] = 0;
				fim--;
				qtdeElementos--;
			}
		}
		
		return item;
	}
	
	public boolean isFull() {
		if (qtdeElementos == tamanho - 1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		if (qtdeElementos == 0) {
			return true;
		}
		
		return false;
	}
	
	public void peek() {
		String elementos = "";
		
		for (int i = inicio; i <= fim; i++) {
			elementos += pilha[i] + " ";
		}
		
		System.out.println(elementos);
	}
}
