import java.util.*;

public class Botin {
    public static void main(String[] args) {
        List<Integer> billetes = new ArrayList<>(Arrays.asList(10,20,50,100,200,500,1000));
        desordenar(billetes);
        reparto(billetes);
    }
     private static void desordenar(List<Integer> lista){
         Collections.shuffle(lista);
     }
     private static void reparto(List<Integer> lista){
         final Integer jefe = 1;
         final Integer miembrosTotales = 3;
         Integer miembro = 1;
         Map<Integer,LinkedList<Integer>> repartido = new HashMap<>();
         Integer dato;
         LinkedList<Integer> billetes;
        while(true){
            if(lista.isEmpty()){
                for(Integer valor:repartido.keySet()){
                    System.out.println(valor + " --> "+repartido.get(valor));
                }
                System.exit(0);
            }
            if(miembro <= miembrosTotales){
                billetes = repartido.get(miembro);
                if(billetes == null) {
                    billetes = new LinkedList<>();
                    billetes.add(lista.get(0));
                    lista.remove(0);
                    repartido.put(miembro,billetes);
                }else{
                    billetes = repartido.get(miembro);
                    billetes.add(lista.get(0));
                    lista.remove(0);
                    repartido.put(miembro,billetes);
                }
                miembro++;
            }else{
                miembro = 1;
            }
        }
     }
}
