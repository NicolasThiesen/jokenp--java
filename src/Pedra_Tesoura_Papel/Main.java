package Pedra_Tesoura_Papel;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha 'pedra', 'papel', ou 'tesoura'");
        String jogada = scanner.nextLine();
        Jogador joao = new Jogador("Joao","pedra");
        Jogo jogao = new Jogo(joao);

        jogao.Jogar();
        System.out.println(jogao.getResultado());

    }

}
