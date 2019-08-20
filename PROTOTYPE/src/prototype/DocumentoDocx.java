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
public class DocumentoDocx extends Documento {

    public DocumentoDocx(DocumentoDocx documentoDocx) {
        this.texto = documentoDocx.texto;
    }

    public DocumentoDocx() {
        this.texto = "documento docx ";
    }

    @Override
    public String exibirInfo() {
        return "esse é um documento docx" + getTexto();
    }

    @Override
    public Documento clonar() {
        return new DocumentoDocx(this);
    }
}
