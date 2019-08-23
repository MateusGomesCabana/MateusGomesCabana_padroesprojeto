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
public class AnimalFactory2 {

    protected Animal animal;

    public AnimalSelvagem getCharct(String tipo) {
        if ("Selvagem".equals(tipo)) {
            return new AnimalSelvagem();
        } else {
            return new AnimalDomestico();
        }

    }

    public void createAnimal(String tipo, String especie) {
        if ("Cachorro".equals(especie)) {
            this.animal = new Cachorro(getCharct(tipo));
        } else if ("Gato".equals(especie)) {
            this.animal = new Gato(getCharct(tipo));

        } else if ("Peixe".equals(especie)) {
            this.animal = new Peixe(getCharct(tipo));
        } else if ("Papagaio".equals(especie)) {
            this.animal = new Papagaio(getCharct(tipo));
        }
    }
    public Animal getAnimal(){
        return this.animal;
    }
}
