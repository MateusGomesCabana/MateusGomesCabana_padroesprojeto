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
public class AnimalSelvagemFactory extends AnimalFactory2 {

    public void createAnimal(String tipo, String especie) {
        if ("Peixe".equals(especie)) {
            this.animal = new Peixe(getCharct(tipo));
        } else if ("Papagaio".equals(especie)) {
            this.animal = new Papagaio(getCharct(tipo));
        }
    }

}
