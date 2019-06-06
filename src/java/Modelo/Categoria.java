/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Categoria {
    private int id_categoria;
    private String nome_categoria;
    private String descricao;
    private String data_cadstro;
    private int ativo;

    public Categoria(int id_categoria, String nome_categoria, String descricao, String data_cadstro, int ativo) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
        this.descricao = descricao;
        this.data_cadstro = data_cadstro;
        this.ativo = ativo;
    }

    public Categoria() {
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_cadstro() {
        return data_cadstro;
    }

    public void setData_cadstro(String data_cadstro) {
        this.data_cadstro = data_cadstro;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
