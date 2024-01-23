import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Loteria {
    public static void main(String[] args) {
        ArrayList<Boletos> listaBoletos = new ArrayList<>();
        listaBoletos.add(new Boletos(9,4));
        listaBoletos.add(new Boletos(10,6));
        listaBoletos.add(new Boletos(9,5));
        listaBoletos.add(new Boletos(1,3));
        imprimeOrdenados(listaBoletos);
        listaBoletos = new ArrayList<>();
        listaBoletos.add(new Boletos(10,5));
        listaBoletos.add(new Boletos(20,5));
        listaBoletos.add(new Boletos(30,5));
        //listaBoletos.add(new Boletos(240,5));
        imprimeOrdenados(listaBoletos);
    }

    public static boolean esJusta(ArrayList<Boletos> lista){
        ArrayList<Boletos> listaOrdenada = ordena(lista);
        Boletos actual;
        Boletos siguiente;
        for(int i = 0; i < listaOrdenada.size()-1;i++){
            actual = listaOrdenada.get(i);
            siguiente = listaOrdenada.get(i+1);
            if(actual.getInvertido() < siguiente.getInvertido() && actual.getConseguido() >= siguiente.getConseguido()){
                return false;
            }
        }
        return true;
    }
    public static void imprimeOrdenados(ArrayList<Boletos> lista){
        System.out.println("-----------------------");
        System.out.println(ordena(lista));
        System.out.println("-----------------------");
        if(esJusta(lista)) System.out.println("SI");
        else System.out.println("NO");
    }
    public static ArrayList<Boletos> ordena(ArrayList<Boletos> lista){
        Collections.sort(lista);
        return lista;
    }

}
class Boletos implements Comparable<Boletos>{
    private int invertido;
    private int conseguido;

    public Boletos(int invertido, int conseguido) {
        this.invertido = invertido;
        this.conseguido = conseguido;
    }

    public int getInvertido() {
        return invertido;
    }

    public int getConseguido() {
        return conseguido;
    }

    @Override
    public int compareTo(Boletos other){
        if(this.invertido == other.getInvertido()) return this.conseguido - other.getConseguido();
        return this.invertido - other.getInvertido();
    }

    @Override
    public String toString(){
        return this.invertido + " " + this.conseguido;
    }
}
