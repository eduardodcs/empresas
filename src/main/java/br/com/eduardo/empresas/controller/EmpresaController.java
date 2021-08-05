package br.com.eduardo.empresas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardo.empresas.dto.EmpresaDto;
import br.com.eduardo.empresas.modelo.Empresa;
import br.com.eduardo.empresas.repository.EmpresaRepository;
import br.com.eduardo.empresas.service.CarregarDadosFicticios;

@RestController
@RequestMapping("/listaEmpresas")
public class EmpresaController {
	
	@Autowired
	EmpresaRepository empresaRepository;

	@GetMapping
	  public ResponseEntity<?> listaEmpresas(Pageable paginacao)  {
	    Page<Empresa> empresas = empresaRepository.findAll(paginacao);
	    Page<EmpresaDto> empresasDto = EmpresaDto.converter(empresas);
	    if (empresas.hasContent()) {
	      return ResponseEntity.ok().body(empresasDto);
	    }
	    return ResponseEntity.ok("Nenhuma empresa está cadastrada. Para carregar os dados fictícios acesse http://localhost:8080/listaEmpresas/carregarEmpresas");
	  }
	
	@GetMapping("/carregarEmpresas")
	  public ResponseEntity<?> carregarEmpresas()  {
	    List<Empresa> listaEmpresas = CarregarDadosFicticios.CarregarDados();
	    listaEmpresas.forEach(empresa ->{
	    	empresaRepository.save(empresa);
	    });
	    return ResponseEntity.ok("Empresas carregadas com sucesso! Acesse novamente http://localhost:8080/listaEmpresas para ver os dados");
	  }
	
}
