package com.simulado2;

public class Dupla<S,W> {

    private S primeiro;
    private W segundo;

    public Dupla(S primeiro, W segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public S getPrimeiro() {
        return primeiro;
    }

    public W getSegundo() {
        return segundo;
    }

    public static void testarDupla() {
        Dupla<String, Integer> dupla1 = new Dupla<>("Ola", 42);
        Dupla<Double, Boolean> dupla2 = new Dupla<>(3.14, true);

        System.out.println(dupla1.primeiro); //ola
        System.out.println(dupla1.segundo); //42

        System.out.println(dupla2.primeiro); //3.14
        System.out.println(dupla2.segundo); //true
    }
}
