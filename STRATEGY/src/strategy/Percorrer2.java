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
public class Percorrer2 implements Percorrer {

    public Percorrer2() {
    }

    @Override
    public String calculaFormaPercorrer(FormaPercorrer vetor) {
        String a = "";
        for (int i = vetor.getList().size()-1; i >= 0; i--) {
            a = a +" - "+ String.valueOf(vetor.getList().get(i));
        }
        return a;
    }

}
