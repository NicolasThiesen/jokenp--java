package Pedra_Tesoura_Papel;

public class Main {

    public static void main (String[] args){

        Jogador joao = new Jogador("Joao","pedra");
        Jogo jogao = new Jogo(joao);

        jogao.Jogar();
        System.out.println(jogao.getResultado());
    }

}
