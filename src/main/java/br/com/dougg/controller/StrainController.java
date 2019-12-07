package br.com.dougg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dougg.entity.Strain;
import br.com.dougg.repository.StrainRepository;

@RestController
@RequestMapping(value = "api/v1/strains")
public class StrainController {
	
	@Autowired
	private StrainRepository repository;
	
	@GetMapping
	public List<Strain> listaStrains() {
		return repository.findAll();
	}
	
	@PostMapping
	public void adicionarStrain(@RequestBody Strain strain) {
		repository.save(strain);
	}

}
