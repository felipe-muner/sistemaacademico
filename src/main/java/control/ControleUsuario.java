package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import persistence.UsuarioDao;
import entity.Usuario;

@WebServlet("/autenticarLogin")
public class ControleUsuario extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String user = request.getParameter("usuario");
			String password = request.getParameter("senha");
			Usuario u = new Usuario(null,user,password,null);
			
			u = new UsuarioDao().efetuarLogin(user, password);
			if(u == null){
				request.setAttribute("msg", "Combinação LOGIN/SENHA incorreto !");
				response.getWriter().print("ERROU");
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
			}else if(("administrador").equalsIgnoreCase(u.getPerfil()) ){
				HttpSession sessao = request.getSession(true);  
				sessao.setAttribute("usuario",u.getLogin());
				sessao.setAttribute("idusuario",u.getIdUsuario());
				//request.getRequestDispatcher("adm/admprincipal.jsp").forward(request, response);
				String usuarioAutenticado = new Gson().toJson(u);
				response.setContentType("application/json");
			    response.setCharacterEncoding("UTF-8");
			    response.getWriter().write(usuarioAutenticado);
			}else if(("usuario").equalsIgnoreCase(u.getPerfil()) ){
				HttpSession sessao = request.getSession(true);  
				sessao.setAttribute("usuario",u.getLogin());
				sessao.setAttribute("idusuario",u.getIdUsuario());
				request.getRequestDispatcher("usu/acadusu.jsp").forward(request, response);
			}else{
				request.setAttribute("msg","Ação Inválida");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
