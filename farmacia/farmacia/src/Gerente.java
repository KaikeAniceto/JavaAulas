
public class Gerente extends Funcionario implements Descontavel{
    
    public Gerente(){
        
    }
    public Gerente (Float salario){
        
    }
    public Gerente(
                     String nome,
                     String matricula,
                     Float salario
                    ){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(salario);
    }
    
    public void cancelarCompra(){
        System.out.println("Compra cancelada");
    }

    @Override
    public String toString() {
        return "Nome" + this.getNome();
    }

    public Double aplicarDesconto(Double valorFinal, Double pecentualDesconto){
        
        Double valorComDesconto = 0.0;
        return valorComDesconto;
    }
    
    @Override
    public Double aplicarDesconto(Double percentualDesconto) {
        Double valor = 0.0;
        return valor;
        
    }

    
    
    
}
