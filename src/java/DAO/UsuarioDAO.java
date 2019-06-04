/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Usuario;

/**
 *
 * @author 2017000879
 */
public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public boolean inserir(Usuario usuario) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.prepareStatement("insert into usuario (id_usuario, nome_usuario) values(default,?);");
            //pstmt.setInt(1, cliente.getCodigo());
            pstmt.setString(1, usuario.getNome_usuario());
//            pstmt.setString(2, usuario.getNascimento());
//            pstmt.setString(3, usuario.getEndereco());
//            pstmt.setString(4, usuario.getCidade());
//            pstmt.setInt(5, usuario.getStatus());
            pstmt.execute();
            pstmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }

    }
}
