import java.util.List;
import model.Operacao;
import model.RecebendoDados;

/**
 * 1.   Criar uma classe Java que recebe uma lista de valores, gera um número sequencial para cada valor
 *      (iniciando em 1) e devolve uma String com os sequencias inteiros concatenados a um texto e ao seu
 *      respectivo valor. Ao final, apresentar o total da soma dos valores.
 *
 *      Exemplo:
 *      Dado de entrada: Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80)
 *      Retorno esperado: "Remessa gerada: 1 cujo valor é R$ 88,00, 2 cujo valor é R$ 130,00, 3 cujo valor é
 *      R$ 54,90, 4 cujo valor é R$ 293,30 e 5 cujo valor é R$ 44,80. Total = 611,00."
 *
 *      Bônus:
 *      Implementação de testes unitários.
 *      README descrevendo o uso do sistema.
 */
public class Main {

    public static void main(String[] args) {

        RecebendoDados recebendoDados = new RecebendoDados();
        List<Double> valores = recebendoDados.EnviaDados();

        Operacao operacao = new Operacao();
        operacao.calcular(valores);
        operacao.imprimir(valores);
    }

}
