package entities_cap5;

public class Pensao {

	private String name;
	private String email;
	private int nQuarto;

	public Pensao(String name, String email, int nQuarto) {
		this.name = name;
		this.email = email;
		this.nQuarto = nQuarto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNQuarto() {
		return nQuarto;
	}

	public void setNQuarto(int nQuarto) {
		this.nQuarto = nQuarto;
	}

	@Override
	public String toString() {
		return 
				getNQuarto()
				+ ": Nome: " 
				+ getName() 
				+", e-mail: " 
				+ getEmail() 
				+";";
				
	}

}
