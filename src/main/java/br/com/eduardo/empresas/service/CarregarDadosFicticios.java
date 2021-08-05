package br.com.eduardo.empresas.service;

import java.util.ArrayList;
import java.util.List;

import br.com.eduardo.empresas.modelo.Empresa;

public class CarregarDadosFicticios {
	
	public static List<Empresa> CarregarDados() {
		Empresa empresa1 = new Empresa("José da Silva", "jose@silva", "Silva & Silva", "01.123.123/0001-00");
		Empresa empresa2 = new Empresa("José Pereira", "jose@pereira", "Pereira & Silva", "02.123.321/0001-01");
		Empresa empresa3 = new Empresa("José Silveira", "jose@silveira", "Silveira & Silva", "03.321.123/0001-02");
		Empresa empresa4 = new Empresa("José Batista", "jose@batista", "Batista & Silva", "04.123.456/0001-03");
		Empresa empresa5 = new Empresa("José Oliveira", "jose@oliveira", "Oliveira & Silva", "05.753.123/0001-04");
		Empresa empresa6 = new Empresa("José da Costa", "jose@costa", "Costa & Silva", "06.123.159/0001-05");
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
		listaEmpresas.add(empresa4);
		listaEmpresas.add(empresa5);
		listaEmpresas.add(empresa6);
		
		return listaEmpresas;
		
	}
	

}
