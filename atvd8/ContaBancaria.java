package exercicio_1;
public class ContaBancaria{
    String nomeDoTitula;
    String numeroDaConta;
    float saldo=0;
    public ContaBancaria(String nomeDoTitula, String numeroDaConta) {
        this.nomeDoTitula = nomeDoTitula;
        this.numeroDaConta = numeroDaConta;
        
    }
    public String getNomeDoTitula() {
        return nomeDoTitula;
    }
    public void setNomeDoTitula(String nomeDoTitula) {
        this.nomeDoTitula = nomeDoTitula;
    }
    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
   
    

    
}
