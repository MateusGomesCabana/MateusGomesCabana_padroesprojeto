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
public class ReceitaFederalProxy extends ReceitaFederal {

    protected String usuario, senha;

    public ReceitaFederalProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String getPagarFisico(String documento, float volorDocumento, float valorImposto) {
        if (this.usuario.equals("usuario") && this.senha.equals("senha")) {
            return super.getPagarFisico(documento, volorDocumento, valorImposto);
        }
        return null;
    }

    @Override
    public String getPagarJuridico(String documento, float volorDocumento, float valorImposto) {
        if (this.usuario.equals("usuario") && this.senha.equals("senha")) {
            return super.getPagarJuridico(documento, volorDocumento, valorImposto);
        }
        return null;
    }
}
