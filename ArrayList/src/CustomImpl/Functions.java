package CustomImpl;

public class Functions {
	
	int ar[]=new int[5];
	int pointer=-1;
	
	
	public static void main(String args[])
	{
		Functions fun=new Functions();
		fun.add(1);
		fun.add(2);
		fun.add(3);
		fun.add(4);
		fun.add(5);
		fun.add(6);
		fun.add(6);
		fun.add(6);
		fun.add(6);
		fun.add(6);
		fun.add(6);
		fun.add(6);
		
		
		
		fun.add(6, 9);
		fun.print();
		System.out.println("size: "+fun.size()+" capacity: "+fun.capacity());
		
		fun.set(1, 0);
		fun.print();
		System.out.println("size: "+fun.size()+" capacity: "+fun.capacity());
		
		fun.remove(2);
		fun.print();
		System.out.println("size: "+fun.size()+" capacity: "+fun.capacity());
		
		
		
		
	}
	
	public  void increaseSize()
	{
		int br[]=new int[2*capacity()];
		for(int i=0;i<size();i++)
		{
			br[i]=ar[i];
		}
		ar=br;
	}
	public  int capacity()
	{
		return ar.length;
	}
	public  int size()
	{
		return pointer+1;
	}
	public  void add(int value)
	{
		if(size()<capacity())
		{
			pointer++;
			ar[pointer]=value;
			return;
		}
		increaseSize();
		pointer++;
		ar[pointer]=value;
	}
	
	public void add(int ind,int value)
	{
		if(ind>size())
			throw new IndexOutOfBoundsException();
		if(size()<capacity())
		{
			for(int i=size()-1;i>=ind;i--)
				ar[i+1]=ar[i];
			ar[ind]=value;
			pointer++;
			return;
		}
		increaseSize();
		for(int i=size()-1;i>=ind;i--)
			ar[i+1]=ar[i];
		ar[ind]=value;
		pointer++;
	}
	
	public void set(int ind,int value)
	{
		if(ind>=size())
			throw new IndexOutOfBoundsException();
		ar[ind]=value;
	}
	
	public void remove(int ind)
	{
		if(size()==0)
		{
			System.out.println("Empty");
			return;
		}
		for(int i=ind;i<size();i++)
			ar[i]=ar[i+1];
		pointer--;
	}
	
	
	public void print()
	{
		for(int i=0;i<size();i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}
	

}
