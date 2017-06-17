//cria classe Funcionário em Java
public class Funcionario {
  private String nome;
  private String telefone;
  private String cpf;
  private String funcao;
  private double salario;

//get e set nome
  public void setNome(String pNome){
    nome = pNome;
  }
  public String getNome() {
    return nome;
  }

//get e  set telefone  
  public void setTelefone(String pTelefone){
    telefone = pTelefone;
  }
  public String getTelefone() {
    return telefone;
  }

//get e set CPF
  public void setCpf(String pCpf){
    cpf = pCpf;
  }
  public String getCpf() {
    return cpf;
  }

//get e set funcao
  public void setFuncao(String pFuncao){
    funcao = pFuncao;
  }
  public String getFuncao() {
    return funcao;
  }

// get e set salario
  public void setSalario(double pSalario){
    salario = pSalario;
  }
  public double getSalario() {
    return salario;
  }  
  
//imprimir
  public void imprimirDados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Telefone: " + this.getTelefone());
    System.out.println("CPF: " + this.getCpf());
    System.out.println("Cargo: " + this.getFuncao());
    System.out.println("Salario: " + this.getSalario());
  }
}