public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("João Silva", "12345");
        Alunos aluno2 = new Alunos("Maria Santos", "67890");
        aluno1.addNota(8.5);
        aluno1.addNota(7.2);
        aluno1.addNota(9.0);
        aluno2.addNota(6.5);
        aluno2.addNota(7.0);
        aluno2.addNota(8.0);
        aluno2.addNota(9.0); 
        System.out.println("Média de notas de " + aluno1.getNome() + " (" + aluno1.getMatricula() + "): " + aluno1.getMedia());
        System.out.println("Média de notas de " + aluno2.getNome() + " (" + aluno2.getMatricula() + "): " + aluno2.getMedia());
    }
}
