package classesAbstratas.test;

import classesAbstratas.dominio.Desenvolvedor;
import classesAbstratas.dominio.Funcionario;
import classesAbstratas.dominio.Gerente;

public abstract class FuncionarioTest01 {
    public  static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 4000);
        gerente.calculaBonus();
        Desenvolvedor desenvolvedor = new Desenvolvedor("Desenvolvedor", 30000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
