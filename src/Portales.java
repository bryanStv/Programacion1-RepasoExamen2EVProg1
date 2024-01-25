import java.util.ArrayList;
import java.util.Arrays;

public class Portales {
    private static Integer siguiente(ArrayList<Integer> lista,int posicion){
        int minimo = Integer.MAX_VALUE;
        int distancia;
        for(Integer actual:lista){
            distancia = Math.abs(posicion-actual);
            if(distancia < minimo){
                minimo = actual;
            }
        }
        return minimo;
    }

    public static void main(String[] args) {
        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2,4,7));
        int aterriza = 3;
        Integer siguiente;
        Integer cual;
        while (!portales.isEmpty()){
            siguiente = siguiente(portales,aterriza);
            System.out.println(siguiente);
            portales.remove(siguiente);
        }
    }
}
