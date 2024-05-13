package digi.demo_jpa2.fr.diginamic;


import digi.demo_jpa2.entities.Fournisseur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class ConnexionJpa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = emf.createEntityManager();

		System.out.println(em);
		em.close();
		emf.close();
	}
}