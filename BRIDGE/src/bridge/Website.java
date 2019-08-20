/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Mateus
 */
public abstract class Website {

    protected Navegador navegador;

    public Website(Navegador nav) {
        navegador = nav;
    }

    public void tipoNavegador() {
        navegador.tipoNavegador();
    }
    public abstract void browser();
}
