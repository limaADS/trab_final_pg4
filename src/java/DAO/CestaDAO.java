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

    public List listarTodas() {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("SELECT * from cesta;");
//            PreparedStatement pstmt = conexao.prepareStatement("SELECT p.*, c.nome_categoria FROM produto p INNER JOIN categoria c"
//                    + "ON p.id_categoria=c.id_categoria;");
            ResultSet resultado = pstmt.executeQuery();
            List<Cesta> lista = new ArrayList<Cesta>();
            while (resultado.next()) {
                Cesta cesta = new Cesta();
//                produto.setId_produto(resultado.getInt("id_produto"));
                lista.add(cesta);
//                lista.add(categoria);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("\n\n\n\n\n\n\n\n\nERRO NO LISTAR CESTA");
            return null;
        }
    }

}
