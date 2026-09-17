package com.simulado2;

public class Simulado2 {

    public static void main(String[] args) {

        //==================== Exercício 1
        //a main não era necessária para a prova, estamos fazendo apenas para testar!
        /*

        Robo robo = new Robo();
        robo.adicionarComando(Direcao.NORTE);
        robo.adicionarComando(Direcao.NORTE);
        robo.adicionarComando(Direcao.LESTE);
        robo.adicionarComando(Direcao.SUL);
        robo.adicionarComando(Direcao.OESTE);
        robo.adicionarComando(Direcao.NORTE);

        robo.andar(); //x = 0 e y = 2  ----> Y: ele foi 3x pro Norte e 1 pro Sul (3 - 1 = 2) | X: Uma pro leste e outra pro oeste (1-1 = 0)
        System.out.println("Norte: " + robo.verEstatistica(Direcao.NORTE));  //3
        System.out.println("Sul: "   + robo.verEstatistica(Direcao.SUL)); //1
        System.out.println("Leste: " + robo.verEstatistica(Direcao.LESTE)); //1
        System.out.println("Oeste: " + robo.verEstatistica(Direcao.OESTE)); //1

        */

       //==================== Exercício 3 (ele deve ser realizado antes do exercício 2)
        /*
        
       Dupla.testarDupla();

        */

       //==================== Exercício 2 (ele deve ser realizado após o exercício 3)
        
        /*

        Dupla<Integer, String> dupla1 = new Dupla<>(5, " anos");
        System.out.println(UtilDupla.dobraEConcatena(dupla1)); // 10 anos
        // Ou para printar armazene numa variável, se quiser:
        //String teste1 = UtilDupla.dobraEConcatena(dupla1); 
        //System.out.println(teste1); 

        // Ou ainda tudo na mesma linha:
        // String teste1 = UtilDupla.dobraEConcatena(new Dupla<Integer,String>(5, " anos"));
        //System.out.println(teste1); 

        Dupla<Double, Double> dupla2 = new Dupla<>(3.0, 4.0);
        System.out.println(UtilDupla.produto(dupla2)); // 12.0

        Dupla<String, String> dupla3 = new Dupla<>("Ola, ", "Mundo!");
        System.out.println(UtilDupla.concatenaStrings(dupla3)); // Olá, Mundo!

        */

       //==================== Exercício 4

        /*
       (a) Um atributo declarado como private pode ter seu valor alterado após a inicializaçãao dentro da própria classe.
       VERDADEIRA — private controla quem acessa. Dentro da própria classe pode ser modificado livremente.

       (b) Um objeto nao instanciado possui o valor inicial null.
       VERDADEIRA

       (c) Um metodo static nao pode ser público.
       FALSA — static e public são independentes. Math.sqrt() é um exemplo clássico de método public static.

       (d) O atributo de um record é imutável.
       VERDADEIRA — em Java, os atributos de um record são implicitamente final, não podendo ser alterados após a criação.

       (e) É uma boa prática usar campos como estadoCivil como String.
       FALSA — é má prática usar String para campos com conjunto finito de valores como estadoCivil. O correto é usar enum.

       (f) Um int é um tipo primitivo e um Integer não.
       VERDADEIRA

       (g) Construtores podem ser chamados estaticamente.
       FALSA — construtores são chamados com new, não estaticamente. new Carro() é a única forma.

       (h) Enums podem possuir métodos
       VERDADEIRA. 

       (i) Um atributo private indica que um atributo pode ser acessado sem uma instância.
       FALSA - private indica que o atributo só pode ser acessado dentro da própria classe. É o oposto: exige uma instância para ser acessado.

       (j) Um atributo default (no modifier) fecha a visibilidade de um método para classes de fora do pacote.
       VERDADEIRA — o modificador default restringe o acesso apenas a classes do mesmo pacote, fechando a visibilidade para classes externas. 
     
       */  
    }
}
