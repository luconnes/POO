
import java.util.HashSet;
import java.util.Scanner;
public class TesteHashSetCpf {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        HashSet<String> cpfs = new HashSet<>();
        for(int i=0;i<10;i++){
            System.out.println("Informe o cpf: ");
            String Cpf = leitor.nextLine();
            cpfs.add(Cpf);
            
        }
        System.out.println(cpfs);
        leitor.close();
    }
}

