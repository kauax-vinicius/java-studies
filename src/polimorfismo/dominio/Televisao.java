package polimorfismo.dominio;

public class Televisao  extends  Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularimposto() {
        System.out.println("Calculando o imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
