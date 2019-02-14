package entities_cap5;

public class Funcionario {

	private Integer id;
	private String name;
	private Double salario;
	
	
	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}


	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

/*
	public void setId(Integer id) {
		this.id = id;
	}
*/

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalario() {
		return salario;
	}

/*
	public void setSalario(Double salario) {
		this.salario = salario;
	} 
*/	
	
	public void aumentaSalario(double porcentagem) {
		salario = salario*(1+porcentagem/100);
	}
	
	
	
	
}
