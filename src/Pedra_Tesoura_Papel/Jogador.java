package Pedra_Tesoura_Papel;


import java.lang.reflect.Array;

public class Jogador {
    private String nome;
    private String jogada;

    public Jogador(String nome, String jogada) {
        this.nome = nome;
        this.jogada = jogada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogada() {
        return jogada;
    }

    public void setJogada(String jogada) {
        this.jogada = jogada;
    }
}
