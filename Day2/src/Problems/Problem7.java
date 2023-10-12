package Problems;

class Addition extends Thread
{
	public void run()
	{int sum=0;
		for(int i=0;i<=20;i++)
		{
			System.out.println("Addition:"+sum+i);
			try {
				Thread.sleep(20);//20 seconds sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Subtraction implements Runnable{
	public void run() {
		int sub=300;
		for(int i=0;i<=20;i++)
		{
			System.out.println("Subtraction:"+(sub-i));
			try {
				Thread.sleep(20);//20seconds sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class Problem7 {

	public static void main(String[] args) {
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		
		Thread thread2=new Thread(sub);
		add.start();
		thread2.start();
		System.out.println("Main thread ended");

	}

}
