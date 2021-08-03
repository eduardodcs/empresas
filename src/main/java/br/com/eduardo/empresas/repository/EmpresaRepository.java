package br.com.eduardo.empresas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardo.empresas.modelo.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
