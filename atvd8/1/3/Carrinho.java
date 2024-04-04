package exercicio_3;

public class Carrinho {
    private String conta;
    private String senha;
    private int contador=0;
    private String produtos[];
    public Carrinho(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        this.produtos=new String[10];
        this.contador=0;
    }
    public  void adicionar(String produto){
        if(this.contador<10){
            this.produtos[this.contador]=produto;
            System.out.println("O produto " + produto + " foi adicionado \n") ;
            this.contador++;
        }
        else{ 
           System.out.println("O carrinho está cheio. \n");
        }
    }
    public  void listar(){
        for(int i=0;i<this.contador;i++){
            System.out.println("produto "+(i+1)+")"+this.produtos[i]+"\n");

        }
    }
    public void remover(String produto) {
        boolean encontrado = false;
        for (int i = 0; i < this.contador; i++) {
            if (produto.equals(produtos[i])) {
                produtos[i] = null;
                encontrado = true;
                if (i != contador - 1) {
                    String aux = produtos[contador - 1];
                    produtos[contador - 1] = produtos[i];
                    produtos[i] = aux;
                }
                contador--;
                System.out.println("O produto: " + produto + " foi removido \n");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O produto: " + produto + " não foi encontrado no carrinho. \n");
        }
    }
}
