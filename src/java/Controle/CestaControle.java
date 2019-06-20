package Controle;

import DAO.CestaDAO;
import DAO.ProdutoDAO;
import Modelo.Cesta;
import Modelo.Produto;
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

public class CestaControle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = null;
        HttpSession session = request.getSession();
        Produto produto = new Produto();
        CestaDAO cdao = new CestaDAO();
        String metodo = request.getParameter("metodo");
        String id_produto = "5";

        if (metodo.equals("add_cesta")) {
            System.out.println("metodo add cesta");
            if (session.getAttribute("id_usuario") != null) {
                Cesta c = new Cesta();
                System.out.println("add");
                String id_u = (String) session.getAttribute("id_usuario");
                String id_p = request.getParameter("id_produto");
                c.setId_usuario(Integer.parseInt(id_u));
                c.setId_produto(Integer.parseInt(id_p));
                if (cdao.inserir(c)) {
                    System.out.println("sucesso ao inserir cesta");
                    response.sendRedirect("Home.jsp");
                } else {
                    System.out.println("ERRO INSERIR CESTA");
                }
            } else {
                System.out.println("não add");
                response.sendRedirect("Login.jsp");
            }
//            id_produto = (String) request.getParameter("id_produto");
//            System.out.println("ID RECEBIDO NO vai_editar_produto: " + id_produto);
//            response.sendRedirect("./VisualizarProduto.jsp?id_produto=" + id_produto + "");
        }

//        System.out.println("Id:" + id_produto + "\nMetodo: " + metodo);
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
            Logger.getLogger(CestaControle.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CestaControle.class.getName()).log(Level.SEVERE, null, ex);
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
