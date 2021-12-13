import model.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class TesteOperacao {

    @Test
    public  void somaTotal(){

        Operacao soma = new Operacao();

        double total = soma.calcular(Collections.singletonList(88.00 + 130.00 + 54.90 + 293.30 + 44.80));
        Assertions.assertEquals(611,total);


    }


}
