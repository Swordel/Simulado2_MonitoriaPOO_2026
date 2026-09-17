package com.simulado2;

import java.util.ArrayList;

public class Robo {
    private int x;
    private int y;
    private ArrayList<Direcao> comandos;

    public Robo(){
        comandos = new ArrayList<>();
    }

    public void andar(){
        for(Direcao d : comandos){
            switch(d){
                case NORTE -> y++;
                case SUL   -> y--;
                case LESTE -> x++;
                case OESTE -> x--;
            }
        }
        
        System.out.println("Posicao final: x=" + x + ", y=" + y); //não era necessário
    }

    /* ======== Método andar() com IF-ELSE:
    
    public void andar(){
        for(Direcao d : comandos){
            if(d == Direcao.NORTE) y++;
            else if(d == Direcao.SUL) y--;
            else if(d == Direcao.LESTE) x++;
            else if(d == Direcao.OESTE) x--;
        }
        System.out.println("Posicao final: x=" + x + ", y=" + y); 
    }
    
    */

     public int verEstatistica(Direcao dir){
        int count = 0;
        for(Direcao d : comandos){
            if(d == dir)
                count++;
        }

        return count;
    }

    //não precisava fazer esse método na prova. Estou colocando apenas para testar!
    public void adicionarComando(Direcao d){
        if(d == null){
            System.out.println("Direcao invalida");
            return;
        }  

        comandos.add(d);
    }
}
