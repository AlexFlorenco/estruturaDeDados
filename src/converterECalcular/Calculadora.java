package converterECalcular;

public class Calculadora {
    public static void lerPosfixa(String rpn, Pilha pilha) {
        String operando = "";

        for (int i = 0; i < rpn.length(); i++) {
            char dado = rpn.charAt(i);

            if (Character.isDigit(dado)) {
                operando += dado;
                continue;
            }

            else if (dado == ' ') {
                if (operando.length() > 0) {
                    pilha.push(Double.valueOf(operando));
                }

                operando = "";
                continue;
            }

            else if (dado == '.') {
                operando += ".";
                continue;
            }

            else if (dado == '+' || dado == '-' || dado == '*' || dado == '/' || dado == '^') {
                pilha.push(calcular(pilha, dado));
            }
        }
    }

    private static double calcular(Pilha pilha, char operador) {
        if (pilha.qtdElementos == 1) {
            System.out.println("Operandos insuficientes para o calculo!");
        }

        else {
            double operando1 = pilha.pop();
            double operando2 = pilha.pop();

            switch (operador) {
                case '+':
                    return operando2 + operando1;
                case '-':
                    return operando2 - operando1;
                case '*':
                    return operando2 * operando1;
                case '/':
                    return operando2 / operando1;
                case '^':
                    return Math.pow(operando2, operando1);
                default:
                    return 0;
            }
        }

        return 0;
    }
}
