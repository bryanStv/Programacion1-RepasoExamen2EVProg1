import java.util.ArrayList;

public class niñosBuenos {
    public static void main(String[] args) {
        ArrayList<Regalos> listaRegalos = new ArrayList<>();
        listaRegalos.add(new Regalos(80,2));
        listaRegalos.add(new Regalos(100,12));
        listaRegalos.add(new Regalos(100,1));
        imprimir(listaRegalos);
        listaRegalos = new ArrayList<>();
        listaRegalos.add(new Regalos(1,1));
        listaRegalos.add(new Regalos(1,1));
        imprimir(listaRegalos);
    }
    public static void imprimir(ArrayList<Regalos> lista){
        lista.stream().sorted().forEach(System.out::println);
    }
}

class Regalos implements Comparable<Regalos>{
    private int bondad;
    private int peso;

    public Regalos(int bondad,int peso){
        this.bondad = bondad;
        this.peso = peso;
    }

    public int getBondad() {
        return bondad;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Regalos other){
        if(this.bondad == other.getBondad()) return this.peso - other.peso;
        return other.getBondad() - this.bondad;
    }

    @Override
    public String toString(){
        return this.bondad + " " + this.peso;
    }
}
