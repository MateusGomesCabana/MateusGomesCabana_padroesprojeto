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
public class CriaAnimal {

    public Animal criaAnimal(String tipo) {
        switch (tipo) {
            case "Cachorro":
                return new Cachorro();
            case "Papagaio":
                return new Papagaio();
            case "Peixe":
                return new Peixe();
            case "Gato":
                return new Gato();
            default:
                return new Cachorro();
        }
    }
}
