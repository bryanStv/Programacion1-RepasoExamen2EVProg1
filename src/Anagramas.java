import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args) {
        try{
            BufferedReader file = new BufferedReader(new FileReader("files/spanish-dict.txt"));
            String palabra;
            Map<String,LinkedList<String>> anagramas = new HashMap<>();
            LinkedList<String> palabras = new LinkedList<>();
            LinkedList<String> valor,datos;
            while((palabra = file.readLine()) != null){
                valor = anagramas.get(ordenar(palabra));
                if(valor == null){
                    datos = new LinkedList<>();
                    datos.add(palabra);
                    anagramas.put(ordenar(palabra),datos);
                }else{
                    datos = valor;
                    datos.add(palabra);
                    anagramas.put(ordenar(palabra),datos);
                }
            }

            if(anagramas.isEmpty()){
                System.out.println("No hay datos");
                System.exit(0);
            }

            file.close();

            int maxNum = 3;
            for(String i:anagramas.keySet()){
                datos = anagramas.get(i);
                if(datos.size() <= maxNum){
                    System.out.println(i + " --> "+anagramas.get(i));
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo");
        }catch(IOException e){
            System.out.println("Error de entrada/salida");
        }
    }

    private static String ordenar(String palabra){
        char[] tabla = palabra.toCharArray();
        Arrays.sort(tabla);
        return new String(tabla);
    }
}
