package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador = new Computador("PcDaXuxa", 2000);
        Tomate tomate  = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
    }
}
