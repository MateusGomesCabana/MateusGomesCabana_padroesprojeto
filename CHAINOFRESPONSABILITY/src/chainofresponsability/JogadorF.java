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
public class JogadorF extends JogadorChain{

    public JogadorF() {
        super(IDJogador.jogadorF);
    }

    @Override
    protected void realizaJogada() {
       System.out.println("Jogador F realizou a jogada");
    }
    
}
