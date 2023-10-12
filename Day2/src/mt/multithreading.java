package mt;

public class multithreading extends Thread{


	@Override
	public void run() {
		int i;
		for (i = 0; i <= 10; i++)
			System.out.println("+");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

class multithreading2 extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 10; i++)
			System.out.println("*");
		
	}
}

 class application {

	public static void main(String[] args) {
		
multithreading mt=new multithreading();
multithreading2 mt2=new multithreading2();

mt.start();
mt2.start();
	}

}
