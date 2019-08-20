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
public class Elevado extends BuilderCasa {

    @Override
    public void buildPreco() {
        home.preco = 45000.00;
    }

    @Override
    public void buildTipo() {
        home.tipo = "Padrão Elevado";
    }

    @Override
    public void buildTamanho() {
        home.tamanho = 250;
    }
}
