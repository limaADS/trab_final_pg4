package DAO;

import Modelo.Cesta;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CestaDAO {

    private Connection conexao;

    public CestaDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public boolean inserir(Cesta cesta) throws SQLException {
        try {
//            PreparedStatement pstmt = conexao.prepareStatement("insert into produto(id_produto, nome_produto) values(default,?);");
            PreparedStatement pstmt = conexao.prepareStatement("insert into cesta "
                    + "(id_cesta, id_produto, id_usuario) "
                    + "values(default,?,?);");

            pstmt.setInt(1, cesta.getId_produto());
            pstmt.setInt(2, cesta.getId_usuario());

            pstmt.execute();
            pstmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    public List<Cesta> listarTodas(String id_usuario) {
        try {
//            PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM produto p INNER JOIN cesta c "
//                    + "ON p.id_produto=c.id_produto INNER JOIN usuario u ON u.id_usuario=c.id_usuario "
//                    + "WHERE c.id_usuario = ? ;");
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM cesta WHERE id_usuario = ? ;");
            pstmt.setInt(1, Integer.parseInt(id_usuario));
            ResultSet resultado = pstmt.executeQuery();
            List<Cesta> lista = new ArrayList<Cesta>();
            while (resultado.next()) {
                Cesta cesta = new Cesta();
                cesta.setId_cesta(resultado.getInt("id_cesta"));
                cesta.setId_cesta(resultado.getInt("id_usuario"));
                cesta.setId_produto(resultado.getInt("id_produto"));
                lista.add(cesta);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("\n\n\n\n\n\n\n\n\nERRO NO LISTAR CESTA");
            return null;
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
                
                produto.setNome_produto(resultado.getString("nome_produto"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setData_cadastro(resultado.getDate("data_cadastro"));
                produto.setAtivo(resultado.getInt("ativo"));
//                lista.add(produto);
            }
            return produto;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO NO PESQUISA POR ID");
            return null;
        }
    }
    
    public boolean delete(int id_cesta) {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("delete from cesta where id_cesta = ?");
            pstmt.setInt(1, id_cesta);
            pstmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
