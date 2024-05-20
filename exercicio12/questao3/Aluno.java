

public class Alunos {
    private String matricula;
    private String nome;
    private int idade;
    private String curso;

    // Construtor corrigido
    public Alunos(String matricula, String nome, int idade, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }   
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}

    


