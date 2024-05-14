package banque.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ASSURANCE_VIE")
public class AssuranceVie extends Compte {
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	@Column(name = "TAUX")
	private Double taux;

	public AssuranceVie() {

	}

	public AssuranceVie(Integer id, String numero, Double solde, Set<Operation> operations, LocalDate dateFin,
			Double taux) {
		super(id, numero, solde, operations);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public Double getTaux() {
		return taux;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}

}
