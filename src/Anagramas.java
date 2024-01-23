import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Anagramas {
    public static void main(String[] args) {
        try{
            BufferedReader file = new BufferedReader(new FileReader("files/spanish-dict.txt"));
            String palabra;
            while((palabra = file.readLine()) != null){
                System.out.println(ordenar(palabra));
            }
        }catch(IOException e){
            System.out.println("Error de entrada/salida");
        }
    }

    public static String ordenar(String palabra){
        String[] tabla = palabra.split("");
        char[] tablaC =
        return Arrays.toString(tabla);
    }
}
