package ar.com.sierra.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.sierra.dao.UsuarioDao;
import ar.com.sierra.modelo.Usuario;

@Service("servicioIngreso")
@Transactional
public class ServicioIngresoImpl implements ServicioIngreso {
	
	@Inject
	private UsuarioDao servicioLoginDao;

	@Override
	public Usuario consultarUsuario (Usuario usuario) {
		return servicioLoginDao.consultarUsuario(usuario);
	}
}
