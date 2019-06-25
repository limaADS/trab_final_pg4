/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.CestaDAO;
import DAO.IntemVendaDAO;
import DAO.VendaDao;
import Modelo.ItemVenda;
import Modelo.Usuario;
import Modelo.Venda;
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
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VendaControle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = null;
        HttpSession session = request.getSession();
        String metodo = request.getParameter("metodo");
        
        VendaDao dao = new VendaDao();
        CestaDAO daoC = new CestaDAO();
        
        if (metodo.equals("venda")) {
            int id_user = Integer.parseInt((String)session.getAttribute("id_usuario")) ;
            Venda venda = new Venda();
            double total_venda = 0;
            
//            venda.setTotal_venda());
            venda.setId_usuario(id_user);
            
           venda = dao.vender(venda);
            if (venda != null) {
                String[] cesta;
                cesta = request.getParameterValues("id_cesta");
                String[] id_produto = request.getParameterValues("id_produto");
                String[] qtd = request.getParameterValues("quantidade");
                
                IntemVendaDAO idao = new IntemVendaDAO();
                for (int i = 0; i < id_produto.length; i++) {
                    if (cesta != null) {
                        daoC.delete(Integer.parseInt(cesta[i]));
                    }
                    ItemVenda iv = new ItemVenda();
                    iv.setId_item_venda(venda.getId_venda());
                    iv.setId_produto(Integer.parseInt(id_produto[i]));
                    iv.setQuantidade(Integer.parseInt(qtd[i]));
                    idao.Inserir(iv);
                }
                response.sendRedirect("Home.jsp?msg=vendido");
            }else{
                response.sendRedirect("Home.jsp?msg=ERRO");
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
            Logger.getLogger(VendaControle.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(VendaControle.class.getName()).log(Level.SEVERE, null, ex);
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
