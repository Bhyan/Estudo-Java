package entities;

public class Company extends TaxPayer{
	private int numberOfEmployees;

	public Company() {
		super();
	}
	
	public Company(String name, double anualIncome, int numberOfEmplyees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmplyees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmplyees) {
		this.numberOfEmployees = numberOfEmplyees;
	}

	@Override
	public double tax() {
		double taxes = 0.0;
		
		if(numberOfEmployees <= 10) {
			taxes = anualIncome * 0.16;
		}
		else {
			taxes = anualIncome * 0.14;
		}
		
		return taxes;
	}
	
	

}
