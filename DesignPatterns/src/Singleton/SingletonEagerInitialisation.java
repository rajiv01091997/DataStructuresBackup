package Singleton;

class Jalebi
{
	private static Jalebi jalebi=new Jalebi();
	
	private Jalebi()
	{
		
	}
	
	public static Jalebi getJalebi()
	{
		return jalebi;
	}
	
}


public class SingletonEagerInitialisation {

	public static void main(String[] args) {
		System.out.println(Jalebi.getJalebi().hashCode());
		System.out.println(Jalebi.getJalebi().hashCode());
		

	}

}
