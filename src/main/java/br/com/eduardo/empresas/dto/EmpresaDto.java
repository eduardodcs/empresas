package br.com.eduardo.empresas.dto;

import org.springframework.data.domain.Page;

import br.com.eduardo.empresas.modelo.Empresa;

public class EmpresaDto {

	private Long id;
	private String nome;
	private String email;
	private String empresa;
	private String cnpj;
	
	public EmpresaDto(Empresa empresa) {
		this.id = empresa.getId();
		this.nome = empresa.getNome();
		this.email = empresa.getEmail();
		this.empresa = empresa.getEmpresa();
		this.cnpj = empresa.getCnpj();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static Page<EmpresaDto> converter(Page<Empresa> empresas) {
		return empresas.map(EmpresaDto::new);
	}


}
