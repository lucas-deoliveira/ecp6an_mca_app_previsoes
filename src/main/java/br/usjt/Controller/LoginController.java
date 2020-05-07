package br.usjt.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.model.Usuario;
import br.usjt.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping(value= {"/login", "/"})
	public ModelAndView login () {
		
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request, Usuario usuario) {
		
		if(loginService.entrada(usuario)) {
			request.getSession().setAttribute("logado", usuario);
			return "redirect:previsoes";
		}
		else {
			
			return "login";
		}
		
	}
	
	@PostMapping("/fazerLogout")
	public String fazerLogout(HttpServletRequest request) {
		
		request.getSession().removeAttribute("logado");
		return "redirect:login";
	}
	
}
