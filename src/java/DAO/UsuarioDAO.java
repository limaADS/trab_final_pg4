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
import java.sql.Date;
//import java.util.Date;

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
