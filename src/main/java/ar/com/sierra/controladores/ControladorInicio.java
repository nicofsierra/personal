package ar.com.sierra.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorInicio {

	@RequestMapping(path="/")
	public ModelAndView irAInicio(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/index")
	public ModelAndView irAIndex(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/trabajos")
	public ModelAndView irATrabajos(){
		return new ModelAndView("trabajos");
	}
	
	@RequestMapping(path="/blog")
	public ModelAndView irABlog(){
		return new ModelAndView("blog");
	}
		
}
