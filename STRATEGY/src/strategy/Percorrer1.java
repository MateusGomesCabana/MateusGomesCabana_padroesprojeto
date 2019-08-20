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
public class Percorrer1 implements Percorrer {

    public Percorrer1() {
    }

    @Override
    public String calculaFormaPercorrer(FormaPercorrer vetor) {
        String a = "";
        for (int i = 0; i < vetor.getList().size(); i++) {
            a = a +" - "+ String.valueOf(vetor.getList().get(i));
        }
        return a;
    }

}
