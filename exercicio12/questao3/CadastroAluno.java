
import java.util.ArrayList;

public class CadastroAluno {
    private ArrayList<Alunos> nomes;

    
    public CadastroAluno(ArrayList<Alunos> nomes){
        this.nomes = nomes;
    }

    public void retornarAlunosLista(){
        for (Alunos aluno : nomes) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }

    public void adicionarNovoAluno(Alunos alunoAdd){
        nomes.add(alunoAdd);
    }
}
