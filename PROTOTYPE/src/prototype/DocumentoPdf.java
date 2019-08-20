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
public class DocumentoPdf extends Documento{
    public DocumentoPdf(DocumentoPdf documentoPdf) {
        this.texto = documentoPdf.texto;
    }

    public DocumentoPdf() {
        this.texto = "documento pdf";
    }

    @Override
    public String exibirInfo() {
        return "esse é um documento pdf" + getTexto();
    }

    @Override
    public Documento clonar() {
        return new DocumentoPdf(this);
    }

}
