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
public class Grupo {

    public GrupoAnimal getGrupo(Animal animal) {
        switch (animal.nome()) {
            case "Peixe":
                return new Aquatico();
            case "Gato":
                return new Terrestre();
            case "Cachorro":
                return new Terrestre();
            case "Papagaio":
                return new Voador();
            default:
                return new Terrestre();

        }

    }
}
