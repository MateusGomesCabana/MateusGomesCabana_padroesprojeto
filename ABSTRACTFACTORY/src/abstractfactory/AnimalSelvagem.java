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
public class AnimalSelvagem extends AnimalFactory {

    @Override
    String continente() {
        return new ContinenteEuropeu().continente();
    }

    @Override
    String cor() {

        return new Vermelho().cor();
    }

}
