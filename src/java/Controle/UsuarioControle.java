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

public class UsuarioControle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        String metodo = request.getParameter("metodo");
        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
//        if (metodo.equals("update")) {
//
//        }
//        
//        if (metodo.equals("delete")) {
//
//        }

        if (metodo.equals("addCarrinho")) {
            String id_produto = request.getParameter("id_produto");
            response.sendRedirect("./VisualizarProduto?id_produto="+id_produto); 

        }

        if (metodo.equals("login")) {
            String usuario_login = request.getParameter("usuario_login");
            String senha = request.getParameter("senha");
            usuario = dao.login(usuario_login, senha);
            try {
                if (usuario != null) {
                    session.setAttribute("nome_usuario", usuario.getNome_usuario());
                    session.setAttribute("email", usuario.getEmail());
                    session.setAttribute("categoria", usuario.getCategoria());
                    session.setAttribute("cpf", usuario.getCpf());
                    session.setAttribute("rg", usuario.getRg());
                    session.setAttribute("data_nascimento", usuario.getData_nascimento());
                    session.setAttribute("endereco", usuario.getEndereco());
                    session.setAttribute("telefone", usuario.getTelefone());
                    session.setAttribute("sexo", usuario.getSexo());
                    session.setAttribute("ativo", usuario.getAtivo());
                    session.setAttribute("id_usuario", usuario.getId_usuario());
                    response.sendRedirect("./Home.jsp");
                } else {
                    response.sendRedirect("./Login.jsp");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (metodo.equals("sair")) {
            session.invalidate();
            response.sendRedirect("./Home.jsp");
        }

        if (metodo.equals("insert")) {
            String nome_usuario = request.getParameter("nome_usuario");
            String data_nascimento = request.getParameter("data_nascimento");
            String rg = request.getParameter("rg");
            String cpf = request.getParameter("cpf");
            String endereco = request.getParameter("endereco");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            String sexo = request.getParameter("sexo");
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
            if (senha.equals(senha2)) {
                if (dao.inserir(usuario)) {
                    response.sendRedirect("./Login.jsp");
                } else {
                    response.sendRedirect("./CadastroUsuario.jsp");
                }
            } else {
                response.sendRedirect("./CadastroUsuario.jsp");

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
