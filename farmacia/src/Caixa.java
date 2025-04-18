public class Caixa extends Funcionario {

    public Caixa(String nome, Integer id) {
        super.setNome(nome);
        super.setId(id);
        if (this.getClass() == Caixa.class) {
            System.out.println("Caixa " + nome + " criado com sucesso!");
        }
    }
    
    public void processarVenda(Venda venda) {
        
    }
   
    public boolean verificarDisponibilidade(Venda venda) {
        for (Medicamento medicamento : venda.ItensVendidos()){
            
        }
    }
    
    
    
    public void emitirRecibo(Venda venda) {
        Cliente cliente = venda.getCliente();
        if (cliente != null) {
            System.out.println("Recibo:");
            System.out.println("Cliente " + cliente.getNome());
            System.out.println("CPF : " + cliente.getCpf());
        } else {
            System.out.println("Recibo:");
            System.out.println("Cliente não registrado");
        }
    }

}
