
public class DescontoPromocional implements Desconto {
    private static final double DESCONTO_PERCENTUAL = 15.0;

    @Override
    public void aplicarDesconto(Venda venda) {
        if (venda.itensVendidos != null && venda.itensVendidos.size() >= 3) {
            venda.aplicarDesconto(DESCONTO_PERCENTUAL);
            System.out.println("Desconto promocional de " + DESCONTO_PERCENTUAL + "% aplicado para compra de 3 ou mais itens");
        }
    }
}
