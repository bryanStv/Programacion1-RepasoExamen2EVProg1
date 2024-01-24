import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        String datos = "5 1 2 + 4 * + 3 -"; //14
        expresionAritmetica(datos);
    }

    private static void expresionAritmetica(String datos){
        Stack<Integer> pilaNumeros = new Stack<>();
        Integer numero,dato1,dato2,resultado;
        for(int i = 0; i < datos.length() ;i+=2){
            switch (datos.charAt(i)){
                case '+':
                    dato1 = pilaNumeros.pop();
                    dato2 = pilaNumeros.pop();
                    resultado = dato1 + dato2;
                    pilaNumeros.push(resultado);
                    break;
                case '*':
                    dato1 = pilaNumeros.pop();
                    dato2 = pilaNumeros.pop();
                    resultado = dato1 * dato2;
                    pilaNumeros.push(resultado);
                    break;
                case '-':
                    dato1 = pilaNumeros.pop();
                    dato2 = pilaNumeros.pop();
                    resultado = dato1 - dato2;
                    pilaNumeros.push(resultado);
                    break;
                case '/':
                    dato1 = pilaNumeros.pop();
                    dato2 = pilaNumeros.pop();
                    resultado = dato1 / dato2;
                    pilaNumeros.push(resultado);
                    break;
                default:
                    numero = Integer.parseInt(""+datos.charAt(i));
                    pilaNumeros.push(numero);
            }
        }
        System.out.println(pilaNumeros.peek());
    }
}
