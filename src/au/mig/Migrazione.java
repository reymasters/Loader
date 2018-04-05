package au.mig;

public class Migrazione {
	
	private String campo;
	private int lung;
	private boolean obbligatorio;
	
	public Migrazione(String campo, int lung, boolean obbligatorio) {
		this.campo = campo;
		this.lung = lung;
		this.obbligatorio = obbligatorio;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public int getLung() {
		return lung;
	}

	public void setLung(int lung) {
		this.lung = lung;
	}

	public boolean isObbligatorio() {
		return obbligatorio;
	}

	public void setObbligatorio(boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}
}
