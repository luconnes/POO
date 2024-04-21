package exercicio_5;
public class Funcionario {
    private String nome;
    private int salario;
    private int idade;
    public  Funcionario(String nome,int salario,int idade){
        this.nome=nome;
        this.salario=salario;
        this.idade=idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
