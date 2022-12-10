package converterECalcular;

public class Conversora {
    public static String conversao(String infixa) {
        String posfixa = "";
        char dado;
        Pilha pilha = new Pilha();

        for (int i = 0; i < infixa.length(); i++) {
            dado = infixa.charAt(i);

            if (dado == ' ') {
                posfixa += dado;
                continue;
            }

            else if (dado == '+' || dado == '-' || dado == '*' || dado == '/' || dado == '^') {
                while ((!pilha.isEmpty()) && prioridade(dado) <= prioridade((char)((int) pilha.peek()))) {
                    posfixa += (char)((int)pilha.pop());
                }

                pilha.push((int)dado);
                continue;
            }

            else if (dado == '(') {
                pilha.push((int)dado);
                continue;
            }

            else if (dado == ')') {
                while ((char)((int)pilha.peek()) != '(') {
                    posfixa += (char)((int)pilha.pop());
                }

                if ((char)((int)pilha.peek()) == '(') {
                    pilha.pop();
                }

                continue;
            }

            else {
                posfixa += dado;
                continue;
            }
        }

        while (pilha.size() > 0) {
            if ((char)((int)pilha.peek()) != '(') {
                posfixa += " " + (char)((int)pilha.pop());
            }
            else {
                pilha.pop();
            }
        }

        return posfixa;
    }


    public static int prioridade (char elemento) {
        int prioridade;
        switch (elemento) {
            case '+':
            case '-':
                prioridade = 1;
                break;
            case '*':
            case '/':
                prioridade = 2;
                break;
            case '^':
                prioridade = 3;
                break;
            default:
                prioridade = 0;
                break;
        }

        return prioridade;
    }
}
