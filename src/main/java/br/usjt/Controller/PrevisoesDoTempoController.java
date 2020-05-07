package br.usjt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.model.PrevisoesDoTempo;
import br.usjt.service.PrevisoesDoTempoService;

@Controller
public class PrevisoesDoTempoController {

	@Autowired
	private PrevisoesDoTempoService previsoesDoTempoService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/previsoes";
	}
	
		@GetMapping("/previsoes")
		public ModelAndView listarPrevisoes() {
			ModelAndView mv = new ModelAndView("previsoes_listagem");
			List<PrevisoesDoTempo> previsoesTempo = previsoesDoTempoService.listarTudo();
			mv.addObject("previsoesTemp", previsoesTempo);
			mv.addObject(new PrevisoesDoTempo());

			return mv;

	}
		@PostMapping("/previsoes")
		public String salvar(PrevisoesDoTempo previsoesDoTempo) {
			previsoesDoTempoService.salvar(previsoesDoTempo);
			return "redirect:/previsoes";
		}
		
}
