import java.util.*;
import java.time.LocalDateTime;

public class Venda {
    private Integer vendaId;
    public double valorTotal;
    private LocalDateTime dataCompra;
    private Cliente cliente;
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public LocalDateTime dataHora;
    public Funcionario funcionario;
    public List<Medicamento> itensVendidos;

    public Venda() {
        this.itensVendidos = new ArrayList<>();
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarItem(Medicamento medicamento) {
        itensVendidos.add(medicamento);
    }
    
    public void calcularTotal() {
        valorTotal = 0;
        for (Medicamento medicamento : itensVendidos) {
            valorTotal += medicamento.getValor();
        }
    }

    public void aplicarDesconto(Desconto desconto) {
        desconto.aplicarDesconto(this);
    }

    public void aplicarDesconto(double percentualDesconto) {
        valorTotal -= valorTotal * percentualDesconto / 100;
    }

    public void getValorTotal() {
        System.out.println("Valor total da compra: " + valorTotal);
    }
}
