package com.camjr.controller;

import com.camjr.modelo.Jogador;

import java.util.LinkedList;

public class JavaLinkedListImplement {

    LinkedList<Jogador> jogadores= new LinkedList<>();

    /**
     *
     * */
    public void adicionarNoFim(Jogador j){
        jogadores.addLast(j);
    }

    public void adicionarNoInicio(Jogador j){
        jogadores.addFirst(j);
    }

    public void adicionarNaPos(int pos, Jogador j){
        jogadores.add(pos, j);
    }

    public void removerUltimo(){
        jogadores.removeLast();
    }

    public void removerNaPos(int pos){
        jogadores.remove(pos);
    }

    public void removerPrimeiro(){
        jogadores.removeFirst();
    }
}
