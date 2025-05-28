package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Aspire 3", 3000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsuung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
