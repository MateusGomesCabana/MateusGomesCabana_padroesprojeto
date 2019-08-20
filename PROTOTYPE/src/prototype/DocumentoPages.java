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
public class DocumentoPages extends Documento {

    public DocumentoPages(DocumentoPages documentPage) {
        this.texto = documentPage.texto;
    }

    public DocumentoPages() {
        this.texto = "documento pages";
    }

    @Override
    public String exibirInfo() {
        return "esse é um documento docx" + getTexto();
    }

    @Override
    public Documento clonar() {
        return new DocumentoPages(this);
    }

}
