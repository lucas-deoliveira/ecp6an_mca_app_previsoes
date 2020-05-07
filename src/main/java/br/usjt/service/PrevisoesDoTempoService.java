package br.usjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Repository.PrevisoesDoTempoRepository;
import br.usjt.model.PrevisoesDoTempo;


@Service
public class PrevisoesDoTempoService {
	@Autowired
	private PrevisoesDoTempoRepository previsoesDoTempoRepositoy;
	public List<PrevisoesDoTempo> listarTudo(){		
		return previsoesDoTempoRepositoy.findAll();
	}
	public void salvar(PrevisoesDoTempo previsoesDoTempo) {	
		previsoesDoTempoRepositoy.save(previsoesDoTempo);
	}
}
