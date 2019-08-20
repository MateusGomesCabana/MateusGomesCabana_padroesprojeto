/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;



/**
 *
 * @author Mateus
 */
public class Construtora {

    protected BuilderCasa construtora;

    public Construtora(BuilderCasa construtora) {
        this.construtora = construtora;
    }

    public void construirCasa() {
        construtora.buildPreco();
        construtora.buildTamanho();
        construtora.buildTipo();

    }

    public Casa getHome() {
        return construtora.getHome();
    }

}
