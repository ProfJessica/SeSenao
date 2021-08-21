package sesenão;

public class SeSenão {
    
    static String maiorEntreDoisValores(int n1, int n2){
        if (n1 > n2) {
            return n1 + " é maior que " + n2 + ".";
        } else if (n2 > n1) {
            return n2 + " é maior que " + n1 + ".";
        } else {
            return n1 + " é igual a " + n2 + ".";
        }
    }

    public static void main(String[] args) {
        
        boolean temCarteira = false; //DADOS DO TIPO LÓGICO (true, false);
       
        int n1 = 10;
        int n2 = 15;
        int n3 = 2;
        int n4 = 2;
        System.out.println(maiorEntreDoisValores(10, 5));
        
        System.out.println(maiorEntreDoisValores(n1, n2));
        
        System.out.println(maiorEntreDoisValores(n3, n4));
        
        System.out.println(maiorEntreDoisValores(n1, n4));
        
         System.out.println(maiorEntreDoisValores(n2, n4));
        
        
//      if ()= SE
//      if else () = SE outra coisa....
//      else = SENÃO

  //      if (CONDIÇÃO A SER AVALIADA) {
  //         AÇÃO
  //      } else {
  //        AÇÃO
  //      }

  
//        if (temCarteira) {
//            System.out.println("Pode passar");
//        } else {
//            System.out.println("Próximoooo!");
//        }

        // int n1
        // int n2
        // DECISÃO
        // se n1 > n2
        // IMPRIMA: n1 é maior que n2
        // mas se n2 > n1
        // IMPRIMA: n2 é maior que n1
        // senão (else) 
        // IMPRIMA: n1 e n2 são iguais.
        
//EXERCÍCIO
//Crie um método com dois parâmetros, que retorne qual é o maior valor entre os dois.

    }
}
