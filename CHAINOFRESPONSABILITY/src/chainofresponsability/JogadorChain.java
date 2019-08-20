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
public abstract class JogadorChain {

    protected JogadorChain next;
    protected IDJogador identificadorJogador;

    public JogadorChain(IDJogador id) {
        next = null;
        identificadorJogador = id;
    }

    public void setNext(JogadorChain vez) {
        if (next == null) {
            next = vez;
        } else {
            next.setNext(vez);
        }
    }
 
    
    public void rodadaJogada(IDJogador id) throws Exception {
        if (podeRealizarJogada(id)) {
            realizaJogada();
        } else {
            if (next == null) {
                throw new Exception("Jogador "+ id +" nao pode realizar jogada");
            }
            next.rodadaJogada(id);
        }
    }
  
    private boolean podeRealizarJogada(IDJogador id) {
        if (this.identificadorJogador == id) {
            return true;
        }
        return false;
    }

    protected abstract void realizaJogada();
}
