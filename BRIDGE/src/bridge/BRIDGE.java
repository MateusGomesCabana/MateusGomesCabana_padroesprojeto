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
public class BRIDGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Website web = new WebBrowser(new Chrome());
        web.browser();
        web = new WebBrowser(new Edge());
        web.browser();
        web = new WebBrowser(new Firefox());
        web.browser();
    }

}
