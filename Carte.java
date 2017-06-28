
public class Carte {
	
	private int valeur;
	private String couleur;
	
	public Carte(int valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public String getValeur() {
		if (this.valeur > 1 && this.valeur < 11) {
			return Integer.toString(this.valeur);
		}
		
		else if (this.valeur == 1) {
			return "As";
		}
		
		else if (this.valeur == 11) {
			return "Valet";
		}
		
		else if (this.valeur == 12) {
			return "Dame";
		}
		
		else if (this.valeur == 13) {
			return "Roi";
		}
		
		return "???";
		
	}
	
	public String toString() {
		return this.getValeur() + " de " + this.couleur;
	}
	
}
