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
public class Burger extends Comida{

    @Override
    public void criaTipoComida() {
        System.out.println("Esse é um burger");
    }    
}
