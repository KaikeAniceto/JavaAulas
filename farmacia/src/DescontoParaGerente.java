
public class DescontoParaGerente implements Desconto {
    private static final double DESCONTO_PERCENTUAL = 10.0;

    @Override
    public void aplicarDesconto(Venda venda) {
        if (venda.funcionario instanceof Gerente) {
            venda.aplicarDesconto(DESCONTO_PERCENTUAL);
            System.out.println("Desconto de " + DESCONTO_PERCENTUAL + "% aplicado pelo gerente");
        }
    }
}
