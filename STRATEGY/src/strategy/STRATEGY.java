/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author ALUNO
 */
public class STRATEGY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormaPercorrer percorreVetor = new FormaPercorrer(1);
        System.out.println(percorreVetor.calculaFormaPercorrer());

        percorreVetor = new FormaPercorrer(2);
         System.out.println(percorreVetor.calculaFormaPercorrer());
    }

}
