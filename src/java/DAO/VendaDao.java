/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VendaDao {

    private Connection conexao;

    public VendaDao() {
        try {
            this.conexao = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public Venda vender(Venda venda) throws SQLException {
        try {

            PreparedStatement pstmt = conexao.prepareStatement("insert into venda"
                    + "(id_venda, id_usuario, total_venda) "
                    + "values(default,?,?);");

            pstmt.setInt(1, venda.getId_usuario());
            pstmt.setDouble(2, venda.getTotal_venda());
            pstmt.execute();
            pstmt = conexao.prepareStatement("select MAX(id_venda) from venda;");
            ResultSet rs;
            rs = pstmt.executeQuery();
            rs.next();
            venda.setId_venda(rs.getInt(1));
            pstmt.close();

            return venda;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }

    }
}
