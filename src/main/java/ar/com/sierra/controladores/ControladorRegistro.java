package ar.com.sierra.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistro {
	
	@RequestMapping(path="/registro")
	public ModelAndView irAIngreso(){
		return new ModelAndView("registro");
	}

}
