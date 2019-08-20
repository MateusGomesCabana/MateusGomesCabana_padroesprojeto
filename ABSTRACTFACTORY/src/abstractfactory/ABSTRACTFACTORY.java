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
        CriaAnimal cria = new CriaAnimal();
        Grupo grupo = new Grupo();
        cria.criaAnimal("Cachorro");
        System.out.println("o animal " + cria.criaAnimal("Cachorro").nome() + " " + grupo.getGrupo(cria.criaAnimal("Cachorro")).getAnimal());
        System.out.println("o animal " + cria.criaAnimal("Papagaio").nome() + " " + grupo.getGrupo(cria.criaAnimal("Papagaio")).getAnimal());
        System.out.println("o animal " + cria.criaAnimal("Peixe").nome() + " " + grupo.getGrupo(cria.criaAnimal("Peixe")).getAnimal());
        System.out.println("o animal " + cria.criaAnimal("Gato").nome() + " " + grupo.getGrupo(cria.criaAnimal("Gato")).getAnimal());

    }

}
