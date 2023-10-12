package BuilderPattern;

class Computer
{
	private String company;
	private String model;
	private int ram;
	
	
	public Computer(String company, String model, int ram) {
		super();
		this.company = company;
		this.model = model;
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Computer [company=" + company + ", model=" + model + ", ram=" + ram + "]";
	}
	
	
}


class Builder
{
	private String company;
	private String model;
	private int ram;
	


	public Builder setCompany(String company) {
		this.company = company;
		return this;
	}


	public Builder setModel(String model) {
		this.model = model;
		return this;
	}


	public Builder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Computer getComp()
	{
		return new Computer(company, model, ram);
	}
	
	
}



public class BuilderMain {

	public static void main(String[] args) {
		
		Computer computer=new Builder().getComp();
		
		System.out.println(computer);
}

}
