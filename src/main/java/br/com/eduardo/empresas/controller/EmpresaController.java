package br.com.eduardo.empresas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.empresas.modelo.Empresa;
import br.com.eduardo.empresas.repository.EmpresaRepository;

@RestController
@RequestMapping("/listaEmpresas")
public class EmpresaController {
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@GetMapping
	public List<Empresa> listaEmpresa(){
		List<Empresa> empresas = empresaRepository.findAll();
		return empresas;
	}

}
