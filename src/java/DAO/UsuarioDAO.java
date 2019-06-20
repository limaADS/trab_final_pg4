package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Usuario;
import java.sql.Date;
import java.sql.ResultSet;
//import java.util.Date;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

  

    public Usuario login(String usuario_login, String senha) {
        Usuario usuario = new Usuario();
        try {
            ResultSet resultado;
            PreparedStatement pstmt = conexao.prepareStatement("select *  from usuario WHERE email= ? and "
                    + "senha= ? ;");
            pstmt.setString(1, usuario_login);
            pstmt.setString(2, senha);
            resultado = pstmt.executeQuery();
            resultado.next();
            usuario.setId_usuario(resultado.getString("id_usuario"));
            usuario.setNome_usuario(resultado.getString("nome_usuario"));
            usuario.setData_nascimento(resultado.getString("data_nascimento"));
            usuario.setRg(resultado.getString("rg"));
            usuario.setCpf(resultado.getString("cpf"));
            usuario.setEndereco(resultado.getString("endereco"));
            usuario.setEmail(resultado.getString("email"));
            usuario.setTelefone(resultado.getString("telefone"));
            usuario.setSexo(resultado.getString("sexo"));
            usuario.setAtivo(resultado.getInt("ativo"));
            usuario.setCategoria(resultado.getString("categoria"));
//            System.out.println("Cadastro: " + usuario.getNome_usuario());
            return usuario;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("erro no try dao");
            return null;
        }
    }

    public boolean inserir(Usuario usuario) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("insert into usuario values(default,?,?,?,?,?,?,?,?,?,?,?);");
            pstmt.setString(1, usuario.getNome_usuario());
            pstmt.setDate(2, Date.valueOf(usuario.getData_nascimento()));
            pstmt.setString(3, usuario.getRg());
            pstmt.setString(4, usuario.getCpf());
            pstmt.setString(5, usuario.getEndereco());
            pstmt.setString(6, usuario.getEmail());
            pstmt.setString(7, usuario.getTelefone());
            pstmt.setString(8, String.valueOf(usuario.getAtivo()));
            pstmt.setString(9, usuario.getSexo());
            pstmt.setString(10, usuario.getCategoria());
            pstmt.setString(11, usuario.getSenha());
            pstmt.execute();
            pstmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }

    public boolean update(Usuario usuario) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("");

            pstmt.setString(1, usuario.getNome_usuario());
            pstmt.setDate(2, Date.valueOf(usuario.getData_nascimento()));
            pstmt.setString(3, usuario.getRg());
            pstmt.setString(4, usuario.getCpf());
            pstmt.setString(5, usuario.getEndereco());
            pstmt.setString(6, usuario.getEmail());
            pstmt.setString(7, usuario.getTelefone());
            pstmt.setString(8, String.valueOf(usuario.getAtivo()));
            pstmt.setString(9, usuario.getSexo());
            pstmt.setString(10, usuario.getCategoria());
            pstmt.setString(11, usuario.getSenha());
            pstmt.execute();
            pstmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }
}
