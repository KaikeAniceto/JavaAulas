
public class Gerente extends Caixa {
    
  public void aplicarDesconto(Venda venda, double percentualDesconto){
      venda.aplicarDesconto(percentualDesconto);
      System.out.println("Desconto de " + percentualDesconto + "% aplicado pelo gerente");
  }

  public Gerente(String nome, Integer id) {
      super(nome, id);
      System.out.println("Gerente " + nome + " criado com sucesso!");
  }
    
}
