package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório  de imposto");
        double imposto = produto.calcularimposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor:"+produto.getValor());
        System.out.println("Imposto a ser pago:"+imposto);

        if (produto instanceof  Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }


}
