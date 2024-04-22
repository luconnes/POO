import java.util.ArrayList;
public class Alunos{
    private String nome;
    private String matricula;
    private ArrayList<Double>notas;
    
    public Alunos(String nome,String matricula){
        this.nome=nome;
        this.matricula=matricula;
        this.notas=new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void addNota(double nota){
        if(notas.size()>3){
            System.out.println("A quantidade máxima de notas já foram inseridas \n");
        }
        else{
        this.notas.add(nota);
        }
    }
    public double getMedia(){
        double i=0;
        for(double nota:notas){
            i=i+nota;
            
        }
        return i/notas.size();
    }
}
