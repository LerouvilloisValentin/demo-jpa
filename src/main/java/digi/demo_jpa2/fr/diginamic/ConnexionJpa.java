package digi.demo_jpa2.fr.diginamic;


import digi.demo_jpa2.entities.Client;
import digi.demo_jpa2.entities.Livre;
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
		em.getTransaction().begin();

		Livre livre = em.find(Livre.class,2);
		if(null!= livre) {
			System.out.println(livre.getAuteur());
		}
		Client client = em.find(Client.class, 1);
		if(null!= client) {
			System.out.println(client.getNom());
		}
		
		//créer un nouvel objet livre
//		Livre livreACreer = new Livre("New livre","Lerouvillois Valentin");
//		em.persist(livreACreer);
		
		//modifier son titre
//		Livre livreAModifier = em.find(Livre.class, 6);
//		if (null != livreAModifier ) {
//			livreAModifier.setTitre("Old livre");
//		}
		
		Livre livreASupprimer = em.find(Livre.class, 6);
		if(null != livreASupprimer) {
			em.remove(livreASupprimer);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}