public class DescontoParaClienteRegistrado implements Desconto {
    private static final double DESCONTO_PERCENTUAL = 5.0;
    
    @Override
    public void aplicarDesconto(Venda venda) {
        if (venda.getCliente() != null && venda.getCliente().getCpf() != null) {
            venda.aplicarDesconto(DESCONTO_PERCENTUAL);
            System.out.println("Desconto de " + DESCONTO_PERCENTUAL + "% aplicado para cliente registrado");
        }
    }
}