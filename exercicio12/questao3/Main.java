


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de alunos
        ArrayList<Alunos> listaDeAlunos = new ArrayList<>();

        // Instanciando a classe CadastroAluno com a lista de alunos
        CadastroAluno cadastro = new CadastroAluno(listaDeAlunos);

        // Adicionando alguns alunos
        Alunos aluno1 = new Alunos("202101", "João Silva", 20, "Engenharia");
        Alunos aluno2 = new Alunos("202102", "Maria Souza", 22, "Medicina");
        Alunos aluno3 = new Alunos("202103", "Carlos Pereira", 21, "Direito");

        cadastro.adicionarNovoAluno(aluno1);
        cadastro.adicionarNovoAluno(aluno2);
        cadastro.adicionarNovoAluno(aluno3);

       cadastro.retornarAlunosLista();
    }
}
