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
public class Catupiry  extends Ingredientes{

    public Catupiry(Comida tipoComida) {
        super(tipoComida);
    }

    @Override
    public void criaTipoComida() {
        ingredienteCatupiry();
        tipoComida.criaTipoComida();
    }

    private void ingredienteCatupiry() {
        System.out.println("Coloca o catupiry como ingrediente");
    }
    
}
