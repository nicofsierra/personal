package ar.com.sierra.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.sierra.modelo.Usuario;
import ar.com.sierra.servicios.ServicioIngreso;

@Controller
public class ControladorIngreso {
	
	@Inject
	private ServicioIngreso servicioIngreso;
	
	@RequestMapping(path="/ingreso")
	public ModelAndView irARegistro(){
		ModelMap modelo = new ModelMap();
		Usuario usuario = new Usuario();
		modelo.put("usuario", usuario);
		return new ModelAndView("ingreso",modelo);
	}
	
	@RequestMapping(path="/validar-ingreso",method=RequestMethod.POST)
	public ModelAndView validaIngreso(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request){
		ModelMap modelo = new ModelMap();
		Usuario usuarioBuscado = servicioIngreso.consultarUsuario(usuario);
		if (usuarioBuscado != null) {
			request.getSession().setAttribute("usuario", usuarioBuscado);
			return new ModelAndView("redirect:/index");
		} else {
			// si el usuario no existe agrega un mensaje de error en el modelo.
			modelo.put("error", "Usuario o clave incorrecta");
		}
		return new ModelAndView("ingreso", modelo);
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {
		request.getSession().removeAttribute("usuario");
		return new ModelAndView("redirect:/index");
	}

}
