/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author ALUNO
 */
abstract class Ingredientes extends Comida{
    protected Comida tipoComida;
 
    public Ingredientes(Comida tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    
}
