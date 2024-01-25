import java.util.*;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        String datos = "5 1 2 + 4 * + 3 -"; //14
        expresionAritmetica(datos);
        datos = "2 4 5 3 / * +"; //6
        expresionAritmetica(datos);
        datos = "6"; //6
        expresionAritmetica(datos);
        datos = "3 5 4 + *";//27
        expresionAritmetica(datos);
        datos = "8 1 1 - /";//ERROR
        expresionAritmetica(datos);
        datos = "1 1 - 8 /";//0
        expresionAritmetica(datos);
        datos = "0 0 /";//ERROR
        expresionAritmetica(datos);
    }

    private static void expresionAritmetica(String datos){
        try{
            Stack<Integer> resultado = new Stack<>();
            boolean isDigit = false;
            Integer numero, n1,n2;
            for(Character c: datos.toCharArray()){
                isDigit = Character.isDigit(c);
                if(isDigit){
                    numero = Integer.parseInt(""+c);
                    resultado.push(numero);
                }
                switch (c){
                    case '+':
                        n1 = resultado.pop();
                        n2 = resultado.pop();
                        numero = n2 + n1;
                        resultado.push(numero);
                        break;
                    case '-':
                        n1 = resultado.pop();
                        n2 = resultado.pop();
                        numero = n2 - n1;
                        resultado.push(numero);
                        break;
                    case '*':
                        n1 = resultado.pop();
                        n2 = resultado.pop();
                        numero = n2 * n1;
                        resultado.push(numero);
                        break;
                    case '/':
                        n1 = resultado.pop();
                        n2 = resultado.pop();
                        numero = n2 / n1;
                        resultado.push(numero);
                        break;
                }
            }
            System.out.println(resultado.peek());
        }catch (EmptyStackException e){
            System.out.println("La pila está vacía");
        }catch (ArithmeticException e){
            System.out.println("ERROR");
        }
    }
}
