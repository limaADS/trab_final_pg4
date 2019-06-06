/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 2017000879
 */
public class UsuarioControle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

//            response.sendRedirect("./Teste.jsp");
//            out.print("Teste -- Lucas Lima");
        String metodo = request.getParameter("metodo");
//            out.print(metodo);

        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();

//            Usuario usuario = new Usuario(null);
//        usuario.setNome_usuario(metodo);
        
        if (metodo.equals("inserir")) {
            String nome_usuario = request.getParameter("nome_usuario");
            String data_nascimento = request.getParameter("data_nascimento");
            String rg = request.getParameter("rg");
            String cpf = request.getParameter("cpf");
            String endereco = request.getParameter("endereco");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            String sexo = request.getParameter("sexo");
            //String categoria = request.getParameter("categoria");
            String senha = request.getParameter("senha");
            String senha2 = request.getParameter("senha2");
            
            usuario.setNome_usuario(nome_usuario);
            usuario.setRg(rg);
            usuario.setCpf(cpf);
            usuario.setCategoria("cliente");
            usuario.setEndereco(endereco);
            usuario.setEmail(email);
            usuario.setTelefone(telefone);
            usuario.setSexo(sexo);
            usuario.setAtivo(1);
            usuario.setSenha(senha);
            usuario.setData_nascimento(data_nascimento);
            
            if (true) {
                if (dao.inserir(usuario)) {
                    //pr = pdao.selectCompleto(pr);
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
