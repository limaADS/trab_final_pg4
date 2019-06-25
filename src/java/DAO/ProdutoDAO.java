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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public boolean InserirFoto(Produto p) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("update produto set foto = ?"
                    + " WHERE id_produto = ? ;");
            pstmt.setString(1, p.getFoto());
            pstmt.setInt(2, p.getId_produto());
            pstmt.execute();
            pstmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Produto pesquisaPorID(int id_produto) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * from produto where id_produto = ?");
            pstmt.setInt(1, id_produto);
            ResultSet resultado = pstmt.executeQuery();
            Produto produto = new Produto();
            while (resultado.next()) {
                produto.setId_produto(resultado.getInt("id_produto"));
                produto.setId_categoria(resultado.getInt("id_categoria"));
                produto.setNome_produto(resultado.getString("nome_produto"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setData_cadastro(resultado.getDate("data_cadastro"));
                produto.setFoto(resultado.getString("foto"));
                produto.setAtivo(resultado.getInt("ativo"));
//                lista.add(produto);
            }
            return produto;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO NO PESQUISA POR ID");
            return null;
        }
    }

    public List listarTodas() {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * from produto WHERE ativo = '1' order by id_produto desc;");
//            PreparedStatement pstmt = conexao.prepareStatement("SELECT p.*, c.nome_categoria FROM produto p INNER JOIN categoria c"
//                    + "ON p.id_categoria=c.id_categoria;");
            ResultSet resultado = pstmt.executeQuery();
            List<Produto> lista = new ArrayList<Produto>();
            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setId_produto(resultado.getInt("id_produto"));
                produto.setId_categoria(resultado.getInt("id_categoria"));
                produto.setNome_produto(resultado.getString("nome_produto"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setData_cadastro(resultado.getDate("data_cadastro"));
                produto.setAtivo(resultado.getInt("ativo"));
                produto.setFoto(resultado.getString("foto"));
                lista.add(produto);
//                lista.add(categoria);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO AQUI");
            return null;
        }
    }

    public List listarTodasPlus() {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * from produto order by id_produto;");
//            PreparedStatement pstmt = conexao.prepareStatement("SELECT p.*, c.nome_categoria FROM produto p INNER JOIN categoria c"
//                    + "ON p.id_categoria=c.id_categoria;");
            ResultSet resultado = pstmt.executeQuery();
            List<Produto> lista = new ArrayList<Produto>();
            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setId_produto(resultado.getInt("id_produto"));
                produto.setId_categoria(resultado.getInt("id_categoria"));
                produto.setNome_produto(resultado.getString("nome_produto"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setData_cadastro(resultado.getDate("data_cadastro"));
                produto.setAtivo(resultado.getInt("ativo"));
                produto.setFoto(resultado.getString("foto"));
                lista.add(produto);
//                lista.add(categoria);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO AQUI");
            return null;
        }
    }

    public int buscarID() {
        System.out.println("Teste buscar ID");
        int ret = 0;
        try {
            PreparedStatement pstmt = conexao.prepareStatement("select max(id_produto) from produto;");
            ResultSet resultado = pstmt.executeQuery();
            resultado.next();
            ret = resultado.getInt(1);
            return ret;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO no buscarID");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public boolean updateProduto(Produto produto) throws SQLException {
        System.out.println("dao update\n\n");
        System.out.println("id no dao: " + produto.getId_produto());
        try {
            PreparedStatement pstmt = conexao.prepareStatement("update produto set nome_produto= ? "
                    + ", descricao= ? , preco= ? , quantidade = ? , ativo = ? WHERE id_produto = ? ;");

            pstmt.setString(1, produto.getNome_produto());
            pstmt.setString(2, produto.getDescricao());
            pstmt.setDouble(3, produto.getPreco());
            pstmt.setInt(4, produto.getQuantidade());
            pstmt.setInt(5, produto.getAtivo());
            pstmt.setInt(6, produto.getId_produto());

            pstmt.execute();
            pstmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    public boolean inserir(Produto produto) throws SQLException {
        try {
//            PreparedStatement pstmt = conexao.prepareStatement("insert into produto(id_produto, nome_produto) values(default,?);");
            PreparedStatement pstmt = conexao.prepareStatement("insert into produto"
                    + "(id_produto, nome_produto, descricao, preco, quantidade, ativo) "
                    + "values(default,?,?,?,?,?);");

            pstmt.setString(1, produto.getNome_produto());
            pstmt.setString(2, produto.getDescricao());
            pstmt.setDouble(3, produto.getPreco());
            pstmt.setInt(4, produto.getQuantidade());
//            pstmt.setInt(5, produto.getId_categoria());
//            pstmt.setDate(6, Date.valueOf(produto.getData_cadastro()));
            pstmt.setInt(5, produto.getAtivo());
//            pstmt.setInt(6, produto.getId_categoria());
            pstmt.execute();
            pstmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

}
