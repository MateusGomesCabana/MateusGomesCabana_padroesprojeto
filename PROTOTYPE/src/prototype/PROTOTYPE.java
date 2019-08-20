/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Mateus
 */
public class PROTOTYPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentoPages pages = new DocumentoPages();
        pages.setTexto("texto");
        pages.clonar();
        System.out.println(pages.exibirInfo());

    }

}
