import java.time.LocalDate;


public class Medicamento {
    private String nome;
    private int quantidade;
    private LocalDate dataValidade;
    private double valor;
    private String codBarras; 

    public Medicamento(String nome, int quantidade, LocalDate dataValidade, double valor, String id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.valor = valor;
        this.codBarras = codBarras;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public double getValor() {
        return valor;
    }

    public String getCodBarras() {
        return codBarras;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    // Método para verificar se o medicamento está vencido
    public boolean estaVencido() {
        return dataValidade.isBefore(LocalDate.now());
    }

    // Método para vender medicamento 
    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        return "Medicamento: Nome=" + nome +
               ", Preço=" + String.format("%.2f", valor) +
               ", Quantidade=" + quantidade +
               ", Código de Barras=" + codBarras +
               ", Data de Validade=" + dataValidade;
    }
}
