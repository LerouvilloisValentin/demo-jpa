package banque.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@Table(name = "OPERATION")
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATE")
	private LocalDate date;
	@Column(name = "MONTANT")
	private Double montant;
	@Column(name = "MOTIF")
	private String motif;
	@ManyToOne
	@JoinColumn(name= "ID_COMPTE")
	private Compte compte;

	public Operation() {
		super();
	}

	public Operation(Integer id, LocalDate date, Double montant, String motif,Compte compte) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte= compte;
	}

	public Integer getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getMontant() {
		return montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}

}
