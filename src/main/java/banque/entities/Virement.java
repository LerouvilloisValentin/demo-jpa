package banque.entities;

import jakarta.persistence.Column;

public class Virement extends Operation{
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;


	public Virement() {
	}
	
	public Virement(String beneficiaire) {
		super();
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
