/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author ALUNO
 */
public class Comprar {

    private Contabilidade contabilidade;
    private Qualidade qualidade;
    private Logistica logistica;
    private Transportadora transportadora;
    private Correio correio;

    public Comprar() {
        this.contabilidade = new Contabilidade();
        this.qualidade = new Qualidade();
        this.logistica = new Logistica();
        this.transportadora = new Transportadora();
        this.correio = new Correio();
    }

    public void startCompras() {
        this.contabilidade.pagar((float) 150.0);
        this.qualidade.validacao();
        this.logistica.embrulha();
        this.transportadora.movimenta("ssd");
        this.correio.entrega("ssd");
    }

}
