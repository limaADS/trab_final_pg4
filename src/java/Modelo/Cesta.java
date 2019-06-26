/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

public class Cesta {

    private int id_cesta;
    private int id_produto;
    private Date data_Cadastro;
    private int id_usuario;
    private int quantidade;

    public Cesta() {
    }

    public Cesta(int id_cesta, int id_produto, Date data_Cadastro, int id_usuario, int quantidade) {
        this.id_cesta = id_cesta;
        this.id_produto = id_produto;
        this.data_Cadastro = data_Cadastro;
        this.id_usuario = id_usuario;
        this.quantidade = quantidade;
    }

    public int getId_cesta() {
        return id_cesta;
    }

    public void setId_cesta(int id_cesta) {
        this.id_cesta = id_cesta;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public Date getData_Cadastro() {
        return data_Cadastro;
    }

    public void setData_Cadastro(Date data_Cadastro) {
        this.data_Cadastro = data_Cadastro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
