package model;
import java.util.List;

public class Operacao {

    public Double calcular(List<Double> lista) {
        double sum = 0;
        for (Double d : lista) sum += d;
        return sum;
    }

    public void imprimir(List<Double> lista) {
        int i;
        System.out.print("Remessa Gerada: ");
        for (i = 0; i < lista.size(); i++) {
            System.out.print(String.format("%s Cujo valor é R$ %s, ", (i+1), lista.get(i)));
        }
        System.out.print( " Total = " + calcular(lista)+ "." );
    }
}
