package entities;

public class Individual extends TaxPayer{
	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}



	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double taxes = 0.0;
	
		if(anualIncome < 20000.00) {
			taxes = anualIncome * 0.15;
		}
		else {
			taxes = anualIncome * 0.25;
		}
		
		taxes -= healthExpenditures * 0.5;
		
		return taxes;
	}
}
