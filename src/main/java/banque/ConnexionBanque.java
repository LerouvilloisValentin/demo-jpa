package banque;

import banque.entities.Client;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionBanque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Client client = em.find(Client.class, 1);
		if (null != client) {
			System.out.println(client.getNom());
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
