import java.util.ArrayList;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Tesoros> lista = new ArrayList<>();
        lista.add(new Tesoros("flecha",5,1));
        lista.add(new Tesoros("sandalias",10,2));
        lista.add(new Tesoros("sarcofago",1000,1000));
        lista.add(new Tesoros("máscara",1000,10));
        lista.add(new Tesoros("arco",10,2));
        lista.stream().sorted().forEach(System.out::println);
    }
}
class Tesoros implements Comparable<Tesoros>{
    private String nombre;
    private int valor;
    private int peso;

    public Tesoros(String nombre,int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Tesoros other){
        if(this.valor == other.getValor()) return this.peso - other.getPeso();
        return other.getValor() - this.valor;
    }
}
