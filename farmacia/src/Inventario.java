
import java.util.HashMap;


public class Inventario {
    private HashMap<String, Medicamento> medicamentos;

    public Inventario() {
        this.medicamentos = new HashMap<String, Medicamento>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.put(medicamento.getNome(), medicamento);
    }

    public Medicamento buscarMedicamento(String nome) {
        return medicamentos.get(nome);
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        Medicamento med = medicamentos.get(nome);
        if (med != null) {
            med.setQuantidade(novaQuantidade);
        }
    }

    public void removerMedicamento(String nome) {
        medicamentos.remove(nome);
    }

    public boolean existeMedicamento(String nome) {
        return medicamentos.containsKey(nome);
    }

    public HashMap<String, Medicamento> getTodosMedicamentos() {
        return new HashMap<String, Medicamento>(medicamentos);
    }
}
