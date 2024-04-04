package exercicio_2;

public class Carro {
    private String modelo;
    private String ano_de_fabricacao;
    private String marca;
    private double velocidade_atual=0;
    
    public Carro(String modelo, String ano_de_fabricacao, String marca) {
        this.modelo = modelo;
        this.ano_de_fabricacao = ano_de_fabricacao;
        this.marca = marca;
         
    }
    public String getModelo() {
        return modelo;
    }
    public String getAno_de_fabricacao() {
        return ano_de_fabricacao;
    }
    public String getMarca() {
        return marca;
    }
    public double getVelocidade_atual() {
        return velocidade_atual;
    }
    public void setModelo(String modelo) {
    
        this.modelo = modelo;
    }
    public void setAno_de_fabricacao(String ano_de_fabricacao) {
        this.ano_de_fabricacao = ano_de_fabricacao;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setVelocidade_atual(double velocidade_atual) {
        if (velocidade_atual<0){
            System.out.println("o valor nao é válido,velocidade alterada para 0;\n");
            this.velocidade_atual=0;   
        }
        else{
            System.err.println("Velocidade alterada para :" + velocidade_atual + "\n");
        this.velocidade_atual = velocidade_atual;
        }
    }




}

