package DAO;

import Modelo.Produto;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

public class RelatorioDAO {

    private Connection conexao;

    public RelatorioDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public List usuariosComprasData(Date dataA, Date dataB) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT DISTINCT u.nome_usuario, u.email FROM "
                    + "produto p INNER JOIN item_venda iv ON p.id_produto=iv.id_produto INNER JOIN venda v "
                    + "ON v.id_venda = iv.id_venda INNER JOIN usuario u ON u.id_usuario=v.id_usuario WHERE "
                    + "v.data_venda BETWEEN ? AND ? ;");
            pstmt.setDate(1, dataA);
            pstmt.setDate(2, dataB);
            ResultSet resultado = pstmt.executeQuery();
            List<Usuario> lista = new ArrayList<Usuario>();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome_usuario(resultado.getString("nome_usuario"));
                usuario.setEmail(resultado.getString("email"));
                lista.add(usuario);
                System.out.println("nome de usuario" + usuario.getNome_usuario());
                System.out.println("email do usuario" + usuario.getEmail());
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("\n\n\n\n\n\n\n\n\nERRO AQUI");
            return null;
        }
    }

    public List pesquisaPorProdutoRelatorio(String id_produto) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT DISTINCT p.nome_produto, u.email, "
                    + "u.nome_usuario , v.data_venda FROM produto p INNER JOIN item_venda iv ON "
                    + "p.id_produto=iv.id_produto INNER JOIN venda v ON v.id_venda = iv.id_venda INNER JOIN"
                    + " usuario u ON u.id_usuario=v.id_usuario WHERE p.id_produto = ? ;");
//            int id = ;
            pstmt.setInt(1, Integer.parseInt(id_produto));
            ResultSet resultado = pstmt.executeQuery();
            List<Usuario> lista = new ArrayList<Usuario>();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome_usuario(resultado.getString("nome_usuario"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setData_nascimento(resultado.getString("data_venda"));
                lista.add(usuario);
                System.out.println("nome de usuario" + usuario.getNome_usuario());
                System.out.println("email do usuario" + usuario.getEmail());
                System.out.println("Data de nascimento" + usuario.getData_nascimento());
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("\n\n\n\n\n\n\n\n\nERRO AQUI");
            return null;
        }
    }

    public List produtosCompradosPorData(Date dataA, Date dataB) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT DISTINCT p.nome_produto, p.preco, "
                    + "v.data_venda FROM produto p INNER JOIN item_venda iv ON p.id_produto=iv.id_produto "
                    + "INNER JOIN venda v ON v.id_venda = iv.id_venda WHERE v.data_venda BETWEEN ? "
                    + "AND ? order by v.data_venda ;");
            pstmt.setDate(1, dataA);
            pstmt.setDate(2, dataB);
            ResultSet resultado = pstmt.executeQuery();
            List<Produto> lista = new ArrayList<Produto>();
            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setNome_produto(resultado.getString("nome_produto"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setData_cadastro(resultado.getDate("data_venda"));
                lista.add(produto);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("\n\n\n\n\n\n\n\n\nERRO AQUI");
            return null;
        }
    }

}
