
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Criar funcionários
        Caixa caixa = new Caixa("João", 0002);
        Gerente gerente = new Gerente("Pedro", 0001);
        
        // Criar medicamentos
        Medicamento m1 = new Medicamento("Dipirona", 10, LocalDate.of(2029, 12, 22), 10.0, "847823");
        Medicamento m2 = new Medicamento("Paracetamol", 10, LocalDate.of(2030, 4, 30), 15.0, "472834");
        Medicamento m3 = new Medicamento("Resfenol", 10, LocalDate.of(2028, 2, 20), 20.0, "985321");
        
        // Criar cliente
        Cliente cliente = new Cliente("Maria", 1001, "123.456.789-00");
        
        // Criar venda
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.funcionario = gerente;
        
        // Adicionar medicamentos à venda
        venda.adicionarItem(m1);
        venda.adicionarItem(m2);
        venda.adicionarItem(m3);
        
        // Calcular total inicial
        venda.calcularTotal();
        System.out.println("Valor inicial: R$ " + venda.valorTotal);
        
        // Testar diferentes tipos de desconto
        System.out.println("\nAplicando descontos:");
        
        // Desconto para cliente registrado
        venda.aplicarDesconto(new DescontoParaClienteRegistrado());
        
        // Desconto para gerente
        venda.aplicarDesconto(new DescontoParaGerente());
        
        // Desconto promocional
        venda.aplicarDesconto(new DescontoPromocional());
        
        // Mostrar valor final
        venda.getValorTotal();
    }
}
