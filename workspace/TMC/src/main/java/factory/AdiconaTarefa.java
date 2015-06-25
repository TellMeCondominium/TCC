package factory;

import model.Fabricante;
import dao.ServicoFabricanteDAO;
import dao.ServicoFabricanteDAOImpl;

public class AdiconaTarefa {

	public static void main(String[] args) {
		ServicoFabricanteDAO fabricanteDAO = new ServicoFabricanteDAOImpl();
		Fabricante samsumg = new Fabricante();
		samsumg.setDescricao("Nokia");
		
		fabricanteDAO.inserir(samsumg);
		
		/*List<Fabricante> fabricantes = fabricanteDAO.listar();
		for (Fabricante fabricante : fabricantes) {
			System.out.println("Fabricante");
			System.out.println("ID: " + fabricante.getId());
			System.out.println("Descri��o: " + fabricante.getDescricao());
			for(Produto prod : fabricante.getProdutos()){
				System.out.println("Produto");
				System.out.println("ID: " + prod.getId());
				System.out.println("Descri��o: " + prod.getDescricao());
			}
		}*/
	}

}
