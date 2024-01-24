import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
            reader.readLine();
            String linea;
            String pais;
            String[] lineas;
            Integer contador, aux;
            Map<String, Integer> paises = new HashMap<>();
            while((linea = reader.readLine())!=null){
                lineas = linea.split(",");
                pais = lineas[6];
                contador = paises.get(pais);
                if(contador==null){
                    paises.put(pais,1);
                }else{
                    aux = paises.get(pais)+1;
                    paises.put(pais,aux);
                }
            }
            reader.close();
            for(String p:paises.keySet()){
                System.out.println(p + " --> " +paises.get(p));
            }
        }catch (FileNotFoundException e){
            System.out.println("Fichero no existente");
        }catch (IOException e){
            System.out.println("Error de entrada/salida");
        }
    }
}
