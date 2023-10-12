package Singleton;

class Samosa
{
	private static Samosa samosa;
	
	private Samosa()
	{
		
	}
	
	public static Samosa getSamosa()
	{
		if(samosa==null)
		{
			samosa=new Samosa();
		}
		return samosa;
	}
}



public class SingletonLazyInitialisation {

	public static void main(String[] args) {
		
       Samosa samosa=Samosa.getSamosa();
       Samosa samosa2=Samosa.getSamosa();
       System.out.println(samosa.hashCode());
       System.out.println(samosa2.hashCode());

	}

}
