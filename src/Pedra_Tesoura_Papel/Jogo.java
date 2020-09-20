package Pedra_Tesoura_Papel;

public class Jogo {
    private String resultado;
    private Jogador jogador;
    private IA ia;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        this.ia = new IA();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void Jogar(){
        String jogadaIA = ia.getJogada();
        String jogadaJogador = jogador.getJogada();

        if (jogadaJogador == "pedra"){
            if (jogadaIA == "pedra"){
                this.resultado = "Empate!!";
            }else if (jogadaIA == "papel") {
                this.resultado = "Pedeu, playboy!!";
            }else if (jogadaIA == "tesoura"){
                this.resultado = "Venceu!!";
            }
        }else if (jogadaJogador == "papel"){
            if (jogadaIA == "pedra"){
                this.resultado = "Venceu!!";
            }else if (jogadaIA == "papel") {
                this.resultado = "Empate!!";
            }else if (jogadaIA == "tesoura"){
                this.resultado = "Pedeu, playboy!!";
            }
        }else if (jogadaJogador == "tesoura"){
            if (jogadaIA == "pedra"){
                this.resultado = "Pedeu, playboy!!";
            }else if (jogadaIA == "papel") {
                this.resultado = "Venceu!!";
            }else if (jogadaIA == "tesoura"){
                this.resultado = "Empate!!";
            }
        }


    }

}
