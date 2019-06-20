package DAO;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection conexao;

    public CategoriaDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public List listarTodas() {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM categoria;");
            ResultSet resultado = pstmt.executeQuery();
            List<Categoria> lista = new ArrayList<Categoria>();
            while (resultado.next()) {
                Categoria categoria = new Categoria();
                categoria.setId_categoria(resultado.getInt("id_categoria"));
                categoria.setNome_categoria(resultado.getString("nome_categoria"));
                categoria.setDescricao(resultado.getString("descricao"));
//                categoria.setData_cadastro(resultado.getDate("data_cadastro"));
//                categoria.setAtivo(resultado.getInt("ativo"));
                lista.add(categoria);
            }
            return lista;
        } catch (Exception e) {
            System.out.println("\n\n\n\n\n\n\n\n\naaaaaaaaaaaaaaaaaaaaaaaa");
            return null;
        }
    }

    public boolean inserir(Categoria categoria) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("insert into categoria(id_categoria, nome_categoria, descricao, ativo)"
                    + " values(default,?,?,?);");
            pstmt.setString(1, categoria.getNome_categoria());
            pstmt.setString(2, categoria.getDescricao());
            pstmt.setInt(3, categoria.getAtivo());
            pstmt.execute();
            pstmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }
//    public boolean update(Usuario usuario) throws SQLException {
//        try {
//            PreparedStatement pstmt = conexao.prepareStatement("");
//
//            pstmt.setString(1, usuario.getNome_usuario());
//            pstmt.setDate(2, Date.valueOf(usuario.getData_nascimento()));
//            pstmt.setString(3, usuario.getRg());
//            pstmt.setString(4, usuario.getCpf());
//            pstmt.setString(5, usuario.getEndereco());
//            pstmt.setString(6, usuario.getEmail());
//            pstmt.setString(7, usuario.getTelefone());
//            pstmt.setString(8, String.valueOf(usuario.getAtivo()));
//            pstmt.setString(9, usuario.getSexo());
//            pstmt.setString(10, usuario.getCategoria());
//            pstmt.setString(11, usuario.getSenha());
//            pstmt.execute();
//            pstmt.close();
//            return true;
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//            return false;
//        }
//
//    }
}
