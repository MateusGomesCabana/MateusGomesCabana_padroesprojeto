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
public abstract class BuilderCasa {
    protected Casa home;

    public BuilderCasa() {
        this.home = new Casa();
    }
    public abstract void buildPreco();
 
    public abstract void buildTipo();
 
    public abstract void buildTamanho();
    
    public Casa getHome() {
        return this.home;
    }
}
