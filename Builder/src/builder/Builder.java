/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Mateus
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Construtora construtora = new Construtora(new Elevado());

        construtora.construirCasa();
        Casa casa = construtora.getHome();
        System.out.println("Tipo da Casa/Preço: " + casa.tipo + "/" + casa.preco + "\ntamanho: " + casa.tamanho);

    }

}
