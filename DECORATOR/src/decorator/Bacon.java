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
public class Bacon  extends Ingredientes {

    public Bacon(Comida tipoComida) {
        super(tipoComida);
    }

    @Override
    public void criaTipoComida() {
        ingredienteBacon();
        tipoComida.criaTipoComida();
    }

    private void ingredienteBacon() {
        System.out.println("Coloca o Bacon como ingrediente");
    }
    
}
