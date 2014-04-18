package persistence;

import entity.Usuario;

public class UsuarioDao extends Dao{
	
	public Usuario efetuarLogin(String log, String sen)throws Exception{
		Usuario u = null;
		open();		
		stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ?");
		stmt.setString(1, log);
		stmt.setString(2, sen);
		rs = stmt.executeQuery();
		
		if(rs.next()){
			u = new Usuario(rs.getInt("idusuario"), rs.getString("login"), rs.getString("senha"), rs.getString("perfil"));
		}		
		close();
		return u;
	}
	
	/**
	 * @throws Exception
	 */
	public void inserirUsuario() throws Exception{
		Usuario u = new Usuario(null,"dcewq","felps123","adm");
		open();		
		stmt = con.prepareStatement("INSERT INTO USUARIO VALUES(null, ?, ?, ?)");
		stmt.setString(1, u.getLogin());
		stmt.setString(2, u.getSenha());
		stmt.setString(3, u.getPerfil());
		stmt.executeUpdate();		
		close();				
	}
	
	
	public static void main(String[] args) {
		try {
		//	System.out.println(new UsuarioDao().efetuarLogin("isabela", "isabela123"));
		 //   new UsuarioDao().inserirUsuario();
			System.out.println("okqqwe");
			String felipe = "felps";
			Integer o = 10;
			System.out.println(o+10);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "21334");
		}
	}
	
}
