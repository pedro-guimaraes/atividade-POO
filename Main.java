public class Main {
    public static void main(String[] args){
      
 //instanciando novos objetos   
    Funcionario funcionario1 = new Funcionario();
    Funcionario funcionario2 = new Funcionario();

//setando os dados do funcionário 1    
    funcionario1.setNome("Adamastor");
    funcionario1.setTelefone("7156946246");
    funcionario1.setCpf("715694624654");
    funcionario1.setFuncao("Estagiário");
    funcionario1.setSalario(3800);
    
//setando os dados do funcionário 2    
    funcionario2.setNome("Januário");
    funcionario2.setTelefone("75654515634");
    funcionario2.setCpf("54132132523");
    funcionario2.setFuncao("Assistente");
    funcionario2.setSalario(5000);
    
 //retornando dados para o usuário   
    funcionario1.imprimirDados();
    funcionario2.imprimirDados();    
   }
}