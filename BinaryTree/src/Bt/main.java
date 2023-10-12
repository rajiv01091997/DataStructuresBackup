package Bt;

public class main {

	public static void main(String[] args) {
	
		Node node=new Node(1);
		node.left=new Node(2);
		node.right=new Node(3);
		node.left.left=new Node(4);
		node.left.right=new Node(5);
		node.left.right.left=new Node(6);
		
		node.right.left=new Node(7);
		node.right.right=new Node(8);
		node.right.right.left=new Node(9);
		node.right.right.right=new Node(10);
		System.out.println("POSTORDER TRAVERSAL");
		postOrder(node);
		System.out.println("\nINORDER TRAVERSAL");
		inOrder(node);
		System.out.println("\nPREORDER TRAVERSAL");
		preOrder(node);
		
		
	}
	
	public static void postOrder(Node node)
	{
		if(node==null)
			return ;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	public static void inOrder(Node node)
	{
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
	public static void preOrder(Node node)
	{if(node==null)
		return;
	
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

}
