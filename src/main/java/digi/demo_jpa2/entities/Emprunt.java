package digi.demo_jpa2.entities;

import java.time.LocalDate;
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
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATE_DEBUT")
	private LocalDate Date_Debut;
	@Column(name = "DELAI")
	private int Delai;
	@Column(name = "DATE_FIN")
	private LocalDate  Date_Fin;
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	@ManyToMany
	@JoinTable(name = "COMPO", 
	joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private Set<Livre> livres;
	
	public Emprunt() {
		super();

	}
	
	public Emprunt(String livre, LocalDate Date_Debut, int Delai, LocalDate Date_Fin, Client client) {
		super();
		this.Date_Debut = Date_Debut;
		this.Delai = Delai;
		this.Date_Fin = Date_Fin;
		this.client= client;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

	public Integer getId() {
		return id;
	}

	public LocalDate getDate_Debut() {
		return Date_Debut;
	}

	public int getDelai() {
		return Delai;
	}

	public LocalDate getDate_Fin() {
		return Date_Fin;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDate_Debut(LocalDate date_Debut) {
		Date_Debut = date_Debut;
	}

	public void setDelai(int delai) {
		Delai = delai;
	}

	public void setDate_Fin(LocalDate date_Fin) {
		Date_Fin = date_Fin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}



	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", Date_Debut=" + Date_Debut + ", Delai=" + Delai + ", Date_Fin=" + Date_Fin + "]";
	}

}
