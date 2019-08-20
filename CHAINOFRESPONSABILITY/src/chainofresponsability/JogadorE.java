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
public class JogadorE extends JogadorChain{

    public JogadorE() {
        super(IDJogador.jogadorE);
    }

    @Override
    protected void realizaJogada() {
        System.out.println("Jogador E realizou a jogada");
    }
    
}
