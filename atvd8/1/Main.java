package exercicio_1;
public class Main{

   public static void main (String [] args){
        ContaBancaria lucas = new ContaBancaria("","");
         lucas.setNomeDoTitula("lucas");
         System.out.println("nome do titular:" + lucas.getNomeDoTitula()+"\n");
       lucas.setNumeroDaConta("1000");
       System.out.println("numero da conta: "+ lucas.getNumeroDaConta()+"\n");
       lucas.setSaldo(10000000);
       System.out.println("saldo da conta : " + lucas.getSaldo()+"\n");
   }
}
