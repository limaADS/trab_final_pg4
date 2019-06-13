/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 2017000879
 */
public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public boolean inserir(Produto produto) throws SQLException {
        try {
//            PreparedStatement pstmt = conexao.prepareStatement("insert into produto(id_produto, nome_produto) values(default,?);");
            PreparedStatement pstmt = conexao.prepareStatement("insert into produto"
                    + "(id_produto, nome_produto, descricao, preco, quantidade, ativo,id_categoria) "
                    + "values(default,?,?,?,?,?,?);");

            pstmt.setString(1, produto.getNome_produto());
            pstmt.setString(2, produto.getDescricao());
            pstmt.setDouble(3, produto.getPreco());
            pstmt.setInt(4, produto.getQuantidade());
//            pstmt.setInt(5, produto.getId_categoria());
//            pstmt.setDate(6, Date.valueOf(produto.getData_cadastro()));
            pstmt.setInt(5, produto.getAtivo());
            pstmt.setInt(6, produto.getId_categoria());
            pstmt.execute();
            pstmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }
}
