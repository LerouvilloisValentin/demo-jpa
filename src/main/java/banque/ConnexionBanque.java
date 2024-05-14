package banque;

import java.time.LocalDate;
import java.util.Collections;

import banque.entities.Adresse;
import banque.entities.Client;
import banque.entities.Compte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionBanque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
	    Client clientBanque = new Client();
	    clientBanque.setNom("Lerouvillois");
	    clientBanque.setPrenom("Valentin");
	    clientBanque.setDateNaissance(LocalDate.of(1993, 11, 12)); 
	    clientBanque.setAdresse(new Adresse(1823,"route de l'ardoisiere",61250,"heloup"));
//	    clientBanque.setComptes("4578",45.45,LocalDate.of(1993, 11, 12),45.25);
	    
	    Client clientBanque2 = new Client();
	    clientBanque.setNom("Leroux");
	    clientBanque.setPrenom("Val");
	    clientBanque.setDateNaissance(LocalDate.of(1995, 11, 12)); 
	    clientBanque.setAdresse(new Adresse(183,"route ardoisiere",72250,"loup"));
	    
	    Compte compte = new Compte();
	    compte.setNumero("7215478");
	    compte.setSolde(1825.45); 

//	    compte.getId().add(clientBanque);
//	    compte.getNumero().add(clientBanque2);

	    em.persist(clientBanque);
	    em.persist(clientBanque2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
