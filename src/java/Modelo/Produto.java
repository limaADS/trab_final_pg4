/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Produto {
    private int id_produto;
    private String nome_produto;
    private String descricao;
    private double preco;
    private int quantidade;
    private int id_categoria;
    private String data_cadastro;
    private int ativo;

    public Produto(int id_produto, String nome_produto, String descricao, double preco, int quantidade, int id_categoria, String data_cadastro, int ativo) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_categoria = id_categoria;
        this.data_cadastro = data_cadastro;
        this.ativo = ativo;
    }

    public Produto(String nome_produto, String descricao, double preco, int quantidade, int id_categoria, String data_cadastro, int ativo) {
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_categoria = id_categoria;
        this.data_cadastro = data_cadastro;
        this.ativo = ativo;
    }

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    
    
    
    
}
