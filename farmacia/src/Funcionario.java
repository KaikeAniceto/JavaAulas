
public abstract class Funcionario {

   private String nome;
   private Integer id;



    
   public void setNome(String n){

       this.nome = n;

   }

   public void setId (Integer id){
       this.id = id;
   }

   public String getNome(){
       return this.nome;
   }

   public Integer getId(){
       return this.id;
   }



}
  
