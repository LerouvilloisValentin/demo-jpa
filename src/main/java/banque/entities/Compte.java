package banque.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "COMPTE")
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NUM")
	private String numero;
	@Column(name = "SOLDE")
	private Double solde;
	@OneToMany(mappedBy = "compte")
	private Set<Operation> operations;

	@ManyToMany(mappedBy = "comptes")
	private Set<Client> clients;

	public Compte() {
	}

	public Compte(Integer id, String numero, Double solde, Set<Operation> operations) {
		super();
		this.id = id;
		this.numero = numero;
		this.solde = solde;
		this.operations = operations;
		operations = new HashSet<Operation>();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public Double getSolde() {
		return solde;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

}
