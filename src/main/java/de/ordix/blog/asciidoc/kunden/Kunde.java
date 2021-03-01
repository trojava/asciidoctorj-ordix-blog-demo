package de.ordix.blog.asciidoc.kunden;

public class Kunde {

	private Long kdNr;
	private String vorname;
	private String nachname;

	public Kunde(long kdNr, String vorname, String nachname) {
		this.kdNr = kdNr;
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Kunde(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public void setKdNr(long kdNr) {
		this.kdNr = kdNr;
	}

	public Long getKdNr() {
		return kdNr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
