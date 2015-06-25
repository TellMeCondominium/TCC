package dao;

import java.util.List;

import model.Fabricante;

public interface ServicoFabricanteDAO {
	public void inserir(Fabricante novo) ;
	public void alterar(Fabricante novo) ;
	public void remover(Fabricante novo) ;
	public Fabricante obterPorId(int id) ;
	public List<Fabricante> listar();
}
