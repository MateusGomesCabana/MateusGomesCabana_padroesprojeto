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
public class ABSTRACTFACTORY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AnimalFactory2 A = new AnimalFactory2();
        A.createAnimal("Selvagem", "Cachorro");
        A.getAnimal();

    }

}
