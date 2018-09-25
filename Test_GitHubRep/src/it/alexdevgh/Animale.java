package it.alexdevgh;

public class Animale {
	String nome;
	String descrizione;
	Boolean isMammifero;
	
	public void saluta() {
		System.out.println("Ciao");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Boolean getIsMammifero() {
		return isMammifero;
	}
	
	
}
