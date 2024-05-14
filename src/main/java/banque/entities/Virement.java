package banque.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class Virement extends Operation {
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	public Virement() {
	}

	public Virement(Integer id, LocalDate date, Double montant, String motif, Compte compte, String beneficiaire) {
		super(id, date, montant, motif, compte);
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}

}
