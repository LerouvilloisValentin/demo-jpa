package banque.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRET_A")
public class LivretA extends Compte{
	@Column(name = "TAUX")
	private Double taux;
	
	public LivretA() {
	}

	public LivretA(Double taux) {
		super();
		this.taux = taux;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}
	
}
