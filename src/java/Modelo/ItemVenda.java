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
public class ItemVenda {
private int id_item_venda;
private int id_produto;
private int id_venda;
private int quantidade;
private double valor_produto;

    public ItemVenda() {
    }

    public ItemVenda(int id_item_venda, int id_produto, int id_venda, int quantidade, double valor_produto) {
        this.id_item_venda = id_item_venda;
        this.id_produto = id_produto;
        this.id_venda = id_venda;
        this.quantidade = quantidade;
        this.valor_produto = valor_produto;
    }

    public int getId_item_venda() {
        return id_item_venda;
    }

    public void setId_item_venda(int id_item_venda) {
        this.id_item_venda = id_item_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }



}
