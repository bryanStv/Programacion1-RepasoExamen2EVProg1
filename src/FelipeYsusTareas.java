import java.util.ArrayList;

public class FelipeYsusTareas {
    public static void main(String[] args) {
        ArrayList<Tareas> listaTareas = new ArrayList<>();
        listaTareas.add(new Tareas(1,6));
        listaTareas.add(new Tareas(2,4));
        listaTareas.add(new Tareas(3,5));
        imprime(listaTareas);
        listaTareas = new ArrayList<>();
        listaTareas.add(new Tareas(30,7));
        listaTareas.add(new Tareas(30,2));
        imprime(listaTareas);
    }

    private static void imprime(ArrayList<Tareas> lista){
        lista.stream().sorted().forEach(System.out::println);
    }
}

class Tareas implements Comparable<Tareas>{
    private int prioridad;
    private int duracion;

    public Tareas(int prioridad,int duracion){
        this.prioridad = prioridad;
        this.duracion = duracion;
    }
    public int getPrioridad() {
        return prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public int compareTo(Tareas other){
        if(this.prioridad == other.getPrioridad()) return this.duracion - other.getDuracion();
        return other.getPrioridad() - this.prioridad;
    }

    @Override
    public String toString(){
        return this.prioridad + " " + this.duracion;
    }

}