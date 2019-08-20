/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Mateus
 */
public class WebBrowser extends Website{
    
    public WebBrowser(Navegador nav) {
        super(nav);
    }

    @Override
    public void browser() {
        System.out.println("escolhendo o tipo de browser");
        navegador.tipoNavegador();
    }
    
    
}
