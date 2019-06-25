/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Modelo.ItemVenda;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class IntemVendaDAO {
 private Connection conexao;

    public IntemVendaDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public boolean Inserir(ItemVenda iv) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("insert into item_venda (id_item_venda, "
                    + "id_produto, id_venda, quantidade, valor_produto) values(default, ?,?,?,?;");
            pstmt.setInt(1, iv.getId_produto());
            pstmt.setInt(2, iv.getId_venda());
            pstmt.setInt(3, iv.getQuantidade());
            pstmt.setDouble(4, iv.getValor_produto());
            pstmt.execute();
            pstmt = conexao.prepareStatement("update produto set quantidade = quantidade - ? where id_produto = ?");
            pstmt.setDouble(1, iv.getQuantidade());
            pstmt.setInt(2, iv.getId_produto());
            pstmt.execute();
            pstmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
