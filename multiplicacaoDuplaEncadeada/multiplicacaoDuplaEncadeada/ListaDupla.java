package multiplicacaoDuplaEncadeada;

public class ListaDupla {
  Node inicio;
  Node fim;


  public boolean addInicio(String value) {
    if (value == null) {
      return false;
    }
    
    Node no = new Node(value);
    
    if (isEmpty()) {
      no.anterior = null;
      no.proximo = null;
      this.inicio = no;
      this.fim = no;
      return true;
    }
    
    no.proximo = this.inicio;
    this.inicio.anterior = no;
    this.inicio = no;

    return true;
  }

  public boolean addFim(char value) {
    return addFim(String.format("%c", value));
  }

  public boolean addFim(String value) {
    if (value == null) {
      return false;
    }
    
    Node no = new Node(value);
    
    if (isEmpty()) {
      no.anterior = null;
      no.proximo = null;
      this.inicio = no;
      this.fim = no;
      return true;
    }
    
    no.proximo = null;
    no.anterior = this.fim;
    this.fim.proximo = no;
    this.fim = no;
    return true;
  }

  public boolean isEmpty() {
    return (this.inicio == null && this.fim == null);
  }

  public String str() {
    String str = "";
    Node no = this.inicio;
    
    while (no != null) {
      str += no.value;
      no = no.proximo;
    }
    
    return str;
  }
}
