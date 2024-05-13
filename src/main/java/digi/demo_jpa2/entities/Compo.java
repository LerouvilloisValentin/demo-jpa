package digi.demo_jpa2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPO")
public class Compo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "ID_LIV")
	private String livre;
	@Column(name = "ID_EMP")
	private String emprunt ;

	
	
	public Compo() {
		super();
	}

public Compo(String livre, String emprunt ) {
		super();
		this.livre = livre;
		this.emprunt = emprunt ;	
	}

	public Integer getId() {
		return id;
	}

	public String getLivre() {
		return livre;
	}

	public String getEmprunt() {
		return emprunt ;
	}

	void setId(Integer id) {
		this.id = id;
	}

	public void setLivre(String livre) {
		this.livre = livre;
	}

	public void setPrenom(String emprunt ) {
		this.emprunt  = emprunt ;
	}


	@Override
	public String toString() {
		return "Livre [id=" + id + ", livre=" + livre + ", emprunt =" + emprunt + "]";
	}

}