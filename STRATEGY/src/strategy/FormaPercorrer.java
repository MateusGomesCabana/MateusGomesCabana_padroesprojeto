/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class FormaPercorrer {

    protected Percorrer percorrer;
    ArrayList<Integer> list;

    public FormaPercorrer(int forma) {
        this.list = new ArrayList<>();
        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        this.list.add(5);
        switch (forma) {
            case 1:
                percorrer = new Percorrer1();

                break;
            case 2:
                percorrer = new Percorrer2();
                break;
        }
    }

    public String calculaFormaPercorrer() {
        return percorrer.calculaFormaPercorrer(this);
    }
    

    public ArrayList<Integer> getList() {
        return list;
    }

}
