package com.simulado2;

public class UtilDupla {

    // Dobra o primeiro valor e concatena com a String do segundo
    public static String dobraEConcatena(Dupla<Integer, String> dupla) {
        Integer dobrado = dupla.getPrimeiro() * 2;
        return dobrado.toString() + dupla.getSegundo();
    }
    
   //============ Outro jeito de fazer o primeiro método
   //O 2 * getPrimeiro() resulta em um int (10), e quando o + encontra uma String do lado direito, 
   //ele automaticamente converte o int para String e concatena.

   /*
   public static String dobraEConcatena(Dupla<Integer, String> dupla){
        return 2*dupla.getPrimeiro() + dupla.getSegundo();
   }
   */

    // Retorna o produto dos dois valores
    public static double produto(Dupla<Double, Double> dupla) {
        return dupla.getPrimeiro() * dupla.getSegundo();
    }

    // Concatena as duas Strings
    public static String concatenaStrings(Dupla<String, String> dupla) {
        return dupla.getPrimeiro() + dupla.getSegundo();
    }

}
