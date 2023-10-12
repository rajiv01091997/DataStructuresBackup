package Problems;

class Box<T>
{
	private T value;

	public Box(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
public class Problem6 {

	public static void main(String[] args) {
		Box<Integer> b1=new Box(42);
		Box<String> b2=new Box("Hello,Generics!");
		
		System.out.println("Value of integer object:"+b1.getValue());
		System.out.println("Value of String object:"+b2.getValue());
	}

}

