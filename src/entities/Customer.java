package entities;

public class Customer {

	private int accountNumber; 
	private String name; 
	private double saldo;
	
	
	public Customer(int accountNumber, String name, double saldo) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.saldo = saldo;
	}

	public Customer(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque + 5.00;
	}

	@Override
	public String toString() {
		return "Customer Account Number=" + accountNumber + ", Name=" + name + ", Saldo em conta=" + getSaldo() + "]";
	}
	
	
	
	
	
	
	
}
