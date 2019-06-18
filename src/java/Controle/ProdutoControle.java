/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.ProdutoDAO;
import Modelo.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoControle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Produto produto = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        String metodo = request.getParameter("metodo");
        System.out.println("Antes do insert IF");
        RequestDispatcher rd = null;

        if (metodo.equals("vai_editar_produto")) {
            String id_produto = request.getParameter("id");
            System.out.println("ID RECEBIDO NO vai_editar_produto: " + id_produto);
            response.sendRedirect("./EditarProduto.jsp?id=" + id_produto + "");

        }

        if (metodo.equals("listarTudo")) {
            List lista = dao.listarTodas();
            request.setAttribute("lista", lista);
            rd = request.getRequestDispatcher(".jsp");
            //Encaminhamento
            rd.forward(request, response);
        }
        if (metodo.equals("insert")) {
            String nome_produto = request.getParameter("nome_produto");
            String descricao = request.getParameter("descricao");
            String preco = request.getParameter("preco");
            String quantidade = request.getParameter("quantidade");
            String id_categoria = request.getParameter("id_categoria");
            System.out.println("preco: " + preco + "\nquantidade: " + quantidade);
            produto.setNome_produto(nome_produto);
            produto.setPreco(Double.parseDouble(preco));
            produto.setDescricao(descricao);
            produto.setQuantidade(Integer.parseInt(quantidade));
            produto.setId_categoria(Integer.parseInt(id_categoria));
            produto.setAtivo(1);
            System.out.println("preco: " + preco + "\nquantidade: " + quantidade);
            if (dao.inserir(produto)) {
                //response.sendRedirect("./Home.html");
                System.out.println("===== SUCESSO NO DAO.INSERIR ====");
            } else {
                System.out.println("===== ERRO NO DAO.INSERIR ====");
            }
        }

        if (metodo.equals("editar")) {
            System.out.println("ESTOU NA EDITAR - UHULLL LINA SEGUNDE-FEIRA!!");
            int id = Integer.parseInt(request.getParameter("id_produto"));
//            System.out.println("\n\n\n\n\n aaaa "+id);
//            request.getSession().setAttribute("id", id);
//            List lista = dao.pesquisaPorID("id_produto");
            String preco = request.getParameter("id_produto");
            System.out.println("VAMOS LA:" + preco);
//         request.setAttribute("listaDeProdutos", lista);
            //request.setAttribute(metodo, id);
            //System.out.println("Id no servlet"+id);
            rd = request.getRequestDispatcher("EditarProduto.jsp");
            rd.forward(request, response);
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
            Logger.getLogger(ProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProdutoControle.class.getName()).log(Level.SEVERE, null, ex);
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
