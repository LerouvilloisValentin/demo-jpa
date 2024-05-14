package banque.entities;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	private Adresse adresse;
	
	@ManyToMany
	@JoinTable(name = "CLIENT_COMPTE", 
	joinColumns = @JoinColumn(name = "ID_CLIENT"), 
	inverseJoinColumns = @JoinColumn(name = "COMPTE_ID"))
	private Set<Compte> comptes;
	@ManyToOne
	@JoinColumn(name = "ID_BANQUE")
	private Banque banque;

	public Client() {
	}

	public Client(Integer id, String nom, String prenom, LocalDate dateNaissance, Banque banque) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		comptes = new HashSet<Compte>();
		this.banque = banque;
	}

	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}



}
