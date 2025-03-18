
public class Principal {

    
    public static void main(String[] args) {
        Gerente f1;
        f1 = new Gerente("Pato Donald", "007", 5000f);
        Caixa f2;
        f2 = new Caixa();
        
        
        
        f2.setNome("Tio Patinhas");
        f2.setMatricula("0007");
        f2.setSalario(3000f);
        
        
        System.out.println("Nome " + f1);
        System.out.println("Nome " + f2);
    }
    
}
