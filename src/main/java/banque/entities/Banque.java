package banque.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity

@Table(name = "BANQUE")
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NOM")
	private String nom;
	
	@OneToMany(mappedBy = "banque")
	private Set<Client> clients;

	public Banque() {
	}
	
	public Banque(Integer id, String nom,Set<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.clients = clients;
	}

	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + "]";
	}

}
