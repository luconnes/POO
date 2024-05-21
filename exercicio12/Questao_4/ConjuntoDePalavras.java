import java.util.HashSet;

public class ConjuntoDePalavras {
    HashSet<String> palavrasSet;
    
 
    public ConjuntoDePalavras(String frase){
        palavrasSet = new HashSet<>();
        String[] palavras = frase.split(",");
        for(String palavra : palavras){
            palavrasSet.add(palavra.trim());
        }
    }
    
    public boolean contemTodas(String frase){
        String[] palavrasParaVerificar = frase.split(",");
        HashSet<String> palavrasParaVerificarSet = new HashSet<>();
        for(String palavra : palavrasParaVerificar){
            palavrasParaVerificarSet.add(palavra.trim());
        }
        return palavrasSet.containsAll(palavrasParaVerificarSet);
    }
    
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("casa, carro, arvore");
        System.out.println(conjunto.contemTodas("casa, carro")); // true
        System.out.println(conjunto.contemTodas("casa, bicicleta")); // false
    }
}
