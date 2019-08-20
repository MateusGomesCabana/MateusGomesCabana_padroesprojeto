/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Mateus
 */
public class CHAINOFRESPONSABILITY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JogadorChain jogador = new JogadorA();
        jogador.setNext(new JogadorB());
        jogador.setNext(new JogadorD());
        jogador.setNext(new JogadorF());

        try {
            jogador.rodadaJogada(IDJogador.jogadorD);
            jogador.rodadaJogada(IDJogador.jogadorF);
            jogador.rodadaJogada(IDJogador.jogadorA);
            jogador.rodadaJogada(IDJogador.jogadorB);
             jogador.rodadaJogada(IDJogador.jogadorC);
              jogador.rodadaJogada(IDJogador.jogadorD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
