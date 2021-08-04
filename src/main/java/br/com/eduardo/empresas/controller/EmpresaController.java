package br.com.eduardo.empresas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.empresas.dto.EmpresaDto;
import br.com.eduardo.empresas.modelo.Empresa;
import br.com.eduardo.empresas.repository.EmpresaRepository;

@RestController
@RequestMapping("/listaEmpresas")
public class EmpresaController {
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@GetMapping
	public Page<EmpresaDto> listaEmpresa(Pageable paginacao){
		Page<Empresa> empresas = empresaRepository.findAll(paginacao);
		return EmpresaDto.converter(empresas);
	}

}
