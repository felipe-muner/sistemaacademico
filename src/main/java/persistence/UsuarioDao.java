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
			u = new Usuario(rs.getInt("idusuario"), rs.getString("login"), null,rs.getString("perfil"));
		}		
		close();
		return u;
	}
	

	
	
	public static void main(String[] args) {
		try {
		//	System.out.println(new UsuarioDao().efetuarLogin("isabela", "isabela123"));
		//   new UsuarioDao().inserirUsuario();
		
		} catch (Exception e) {
			System.out.println(e.getMessage() + "21334");
		}
	}
	
}
