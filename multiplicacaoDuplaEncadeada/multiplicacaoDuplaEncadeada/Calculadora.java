package multiplicacaoDuplaEncadeada;

public class Calculadora {
  
  public static String multiplicar(String str1, String str2) {
    ListaDupla lista1 = fatiar(str1);
    ListaDupla lista2 = fatiar(str2);
    
    Node calda1 = lista1.fim;
    Node calda2 = lista2.fim;
    
    ListaDupla resultado = gerarListaDupla(calda1, calda2);
    
    Node aux = resultado.fim;
    
    int buffer = 0;
    int n1 = 0;
    int n2 = 0;
    int res = 0;
    
    
    while (calda1 != null) {
      calda2 = lista2.fim;
      n1 = Integer.parseInt(calda1.value);
      Node aux2 = aux;
      
      while (calda2 != null) {
        n2 = Integer.parseInt(calda2.value);
        buffer = Integer.parseInt(aux2.value);
        res = n1 * n2 + buffer;
        buffer = res / 100;
        res -= buffer * 100;
        aux2.value = String.format("%02d", res);
        buffer += Integer.parseInt(aux2.anterior.value);
        aux2.anterior.value = String.format("%02d", buffer);
        aux2 = aux2.anterior;
        calda2 = calda2.anterior;
      }
      
      aux = aux.anterior;
      calda1 = calda1.anterior;
    }
    
    return formatar(resultado.str()) ;
  }  
  
  private static String formatar(String str) {
    int length = str.length();
    int i = 0;
    
    for (i = 0; i < length; i++) {
      if (str.charAt(i) != '0') {
    	  break;
      }
    }
    
    return str.substring(i, length);
  }

  private static ListaDupla gerarListaDupla(Node calda1, Node calda2) {
    ListaDupla lista = new ListaDupla();
    
    while (calda1 != null) {
      lista.addInicio("0");
      
      while (calda2 != null) {
        lista.addInicio("0");
        calda2 = calda2.anterior;
      }
      
      calda1 = calda1.anterior;
    }
    
    return lista;
  }

  private static ListaDupla fatiar(String str) {
	  int tamanho = str.length();
	  int inicio = 0;
	  ListaDupla lista = new ListaDupla();
    
    if (tamanho % 2 == 1) {
    	lista.addFim(str.charAt(inicio++));
    }
    
    for (int i = inicio; i < tamanho; i += 2) {
    	lista.addFim(str.substring(i, i + 2));
    }
    
    return lista;
  }
}
  
