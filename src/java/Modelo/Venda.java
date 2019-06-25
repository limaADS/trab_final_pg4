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
public class Venda {
    private int id_venda;
    private int id_usuario;
    private double total_venda;

    public Venda() {
    }

    public Venda(int id_venda, int id_usuario, double total_venda) {
        this.id_venda = id_venda;
        this.id_usuario = id_usuario;
        this.total_venda = total_venda;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }
    
    
}
