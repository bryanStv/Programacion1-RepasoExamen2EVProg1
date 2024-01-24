import java.util.Stack;

public class Parentesis {
    //MAL, Mirarlo de nuevo
    public static void main(String[] args) {
        String parentizado = "{([hola])}[]";
        Stack<Character> pilaParentesis = new Stack<>();
        char valor;
        for(int i = 0; i < parentizado.length();i++){
            if(parentizado.charAt(i) == '{' || parentizado.charAt(i) == '(' || parentizado.charAt(i) == '['){
                pilaParentesis.push(parentizado.charAt(i));
            }else{
                valor = pilaParentesis.peek();
                //if(pilaParentesis.size()==1 && )
                if(valor == '}' || valor == ')' || valor == ']'){
                    if(!bienParentizada(valor,pilaParentesis)){
                        System.out.println("está mal parentizada");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Está bien parentizada");
    }

    private static boolean bienParentizada(Character dato,Stack<Character> pila){
        if(pila.peek() == '}'){
            if(dato == '{'){
                pila.pop();
                return true;
            }else{
                return false;
            }
        }else if(pila.peek() == ')'){
            if(dato == '('){
                pila.pop();
                return true;
            }else{
                return false;
            }
        }else if(pila.peek() == ']'){
            if(dato == '['){
                pila.pop();
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
