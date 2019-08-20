/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author ALUNO
 */
public class ReceitaFederal {

    float valueDocument, valueImposto;
    String document;

    public ReceitaFederal() {
        valueImposto = 5;

    }

    public String getPagarFisico(String documento, float valorDocumento, float valorImposto) {
        this.document = documento;
        this.valueDocument = valorDocumento;
        return "foi pago o documento " + this.document + " do valor do documento " + this.valueDocument + "e com carga de pessoa fisica de " + (this.valueImposto * valorImposto);
    }

    public String getPagarJuridico(String documento, float valorDocumento, float valorImposto) {
        return "foi pago o documento " + this.document + " do valor do documento " + this.valueDocument + "e com carga de pessoa juridica de " + (valorImposto);
    }

}
