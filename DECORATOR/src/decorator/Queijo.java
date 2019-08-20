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
public class Queijo extends Ingredientes {

    public Queijo(Comida tipoComida) {
        super(tipoComida);
    }

    @Override
    public void criaTipoComida() {
        ingredienteQueijo();
        tipoComida.criaTipoComida();
    }
    private void ingredienteQueijo() {
        System.out.println("Coloca o queijo como ingrediente");
    }
}
