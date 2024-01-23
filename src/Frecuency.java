import java.util.*;

public class Frecuency {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(Arrays.asList("uno","dos","dos","tres","tres","tres"));
        Map<String,Integer> mapaFrecuencias = new HashMap<>();
        Integer valor;
        for(String palabra: palabras){
            valor = mapaFrecuencias.get(palabra);
            if(valor == null){
                mapaFrecuencias.put(palabra,1);
            }else{
                mapaFrecuencias.put(palabra,++valor);
            }
        }
        System.out.println(mapaFrecuencias.toString());
    }
}
