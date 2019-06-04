/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 2017000879
 */
public class Usuario {
    private String id_usuario;
    private String nome_usuario;
    private String rg;
    private String cpf;
    private String categoria;
    private String sexo;
    private String ativo;
    private String telefone;
    private String email;
    private String endereco;

    public Usuario(String id_usuario, String nome_usuario, String rg, String cpf, String categoria, String sexo, String ativo, String telefone, String email, String endereco) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.rg = rg;
        this.cpf = cpf;
        this.categoria = categoria;
        this.sexo = sexo;
        this.ativo = ativo;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Usuario(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
