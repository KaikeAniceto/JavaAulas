
public class Cliente {

    private String nome;
    private Integer codCliente;
    private String cpf;

    public Cliente(String nome, Integer codCliente, String cpf) {
        this.nome = nome;
        this.codCliente = codCliente;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getCodCliente() {
        return codCliente;
    }


    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    }



