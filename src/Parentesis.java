import java.util.EmptyStackException;
import java.util.Stack;

public class Parentesis {
    //MAL, Mirarlo de nuevo
    public static void main(String[] args) {
        String parentizado = "{([hola])}[]";
        try{
            Stack<Character> pila = new Stack<>();
            boolean bienParentizado = true;
            for(char c: parentizado.toCharArray()){
                char var = c;
                switch (c){
                    case '{':
                    case '(':
                    case '[':
                        pila.push(c);
                        break;
                    case '}':
                        if(pila.empty()) malParentizada();
                        if(pila.peek() == '{'){
                            pila.pop();
                            break;
                        }else{
                            malParentizada();
                        }
                    case ')':
                        if(pila.empty()) malParentizada();
                        if(pila.peek() == '('){
                            pila.pop();
                            break;
                        }else{
                            malParentizada();
                        }
                    case ']':
                        if(pila.empty()) malParentizada();
                        if(pila.peek() == '['){
                            pila.pop();
                            break;
                        }else{
                            malParentizada();
                        }
                }
            }
            if(pila.isEmpty()){
                System.out.println("La cadena está bien parentizada");
            }else{
                System.out.println("La cadena está mal parentizada");
            }
        }catch (EmptyStackException e){
            System.out.println("La pila está vacía");
        }
    }

    private static void malParentizada(){
        System.out.println("La cadena está mal parentizada");
        System.exit(0);
    }
}
