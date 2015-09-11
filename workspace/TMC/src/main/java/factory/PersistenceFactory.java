package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistenceFactory {
	private static final String NAME = "TCM";

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void start() {
		factory = Persistence.createEntityManagerFactory(NAME);
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
	}

	private static void close() {
		transaction.commit();
		manager.close();
		factory.close();
	}

	public static void incluir(Object entidade) throws Exception {
		try {
			PersistenceFactory.start();
			manager.persist(entidade);
		} catch (Exception e) {
			throw new Exception("Erro ao executar o cadastro");
		} finally{
			PersistenceFactory.close();
		}
	}

	public static void alterar(Object entidade) {
		PersistenceFactory.start();
		manager.merge(entidade);
		PersistenceFactory.close();
	}

	public static void remover(Object entidade) {
		PersistenceFactory.start();
		Object c = manager.merge(entidade);
		manager.remove(c);
		PersistenceFactory.close();
	}

}
