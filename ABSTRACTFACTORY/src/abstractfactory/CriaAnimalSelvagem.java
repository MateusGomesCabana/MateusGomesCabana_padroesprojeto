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
public class CriaAnimalSelvagem extends AnimalFactory2 {

    Animal animal;

    public void criaAnimal(String tipo, String especie) {
        if ("Cachorro".equals(especie)) {
            this.animal = new Cachorro(getCharct(tipo));
        } else if ("Gato".equals(especie)) {
            this.animal = new Gato(getCharct(tipo));
        } else if ("Peixe".equals(especie)) {
            this.animal = new Peixe(getCharct(tipo));
        }else if ("Papagaio".equals(especie)) {
            this.animal = new Papagaio(getCharct(tipo));
        }
    }

}
