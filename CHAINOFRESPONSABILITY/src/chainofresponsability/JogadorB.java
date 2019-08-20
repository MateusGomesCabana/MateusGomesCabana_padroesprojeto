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
public class JogadorB extends JogadorChain{

    public JogadorB() {
        super(IDJogador.jogadorB);
    }

    @Override
    protected void realizaJogada() {
        System.out.println("Jogador B realizou a jogada");
    }
    
}
