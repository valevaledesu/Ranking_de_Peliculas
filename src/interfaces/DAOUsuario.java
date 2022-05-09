package interfaces;
import java.util.List;

import entidades.Usuario;


public interface DAOUsuario {

	public void registrar (Usuario us) throws Exception;
	public void modificar (Usuario us) throws Exception;
	public void eliminar (Usuario us) throws Exception;
	public void buscar (Usuario us) throws Exception;
	public List<Usuario> listar() throws Exception;
		
}
