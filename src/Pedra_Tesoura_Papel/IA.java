package Pedra_Tesoura_Papel;

import java.util.Random;

public class IA {

    private String jogada;
    private String[] jokenpo = {"pedra","papel","tesoura"};
    private Random random = new Random();

    public IA() {

    }

    public String getJogada(){
        int randomIndex = random.nextInt(this.jokenpo.length);
        this.jogada = this.jokenpo[randomIndex];
        return this.jogada;
    }

}
