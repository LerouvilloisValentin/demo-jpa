package banque.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {
	@Column(name = "NUMERO")
	private String numero;
	@Column(name = "RUE")
	private String rue;
	@Column(name = "CODE_POSTAL")
	private int codePostal;
	@Column(name = "VILLE")
	private String ville;

	public Adresse() {
	}

	public Adresse(String numero, String rue, int codePostal, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getNumero() {
		return numero;
	}

	public String getRue() {
		return rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
}