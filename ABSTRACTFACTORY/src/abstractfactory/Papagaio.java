/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Mateus
 */
public class Papagaio implements Animal {

    private String cor;
    private String continente;
    private AnimalFactory animalFactory;
    public Papagaio(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }


    @Override
    public void nascer() {
        this.cor = this.animalFactory.cor();
        this.continente = this.animalFactory.continente();
    }

}
