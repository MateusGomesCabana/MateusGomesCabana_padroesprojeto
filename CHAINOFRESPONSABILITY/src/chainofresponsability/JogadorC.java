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
public class JogadorC extends JogadorChain{

    public JogadorC() {
        super(IDJogador.jogadorC);
    }

    @Override
    protected void realizaJogada() {
        System.out.println("Jogador C realizou a jogada");
    }
    
}
