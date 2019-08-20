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
public class JogadorA extends JogadorChain{

    public JogadorA() {
        super(IDJogador.jogadorA);
    }
   
    
    @Override
    protected void realizaJogada() {
        System.out.println("Jogador A realizou a jogada");
    }
    
}
