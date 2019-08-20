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
public class JogadorD extends JogadorChain{

    public JogadorD() {
        super(IDJogador.jogadorD);
    }

    @Override
    protected void realizaJogada() {
        System.out.println("Jogador D realizou a jogada");
    }
    
}
