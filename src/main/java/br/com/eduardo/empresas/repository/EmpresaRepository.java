package br.com.eduardo.empresas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.empresas.modelo.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
