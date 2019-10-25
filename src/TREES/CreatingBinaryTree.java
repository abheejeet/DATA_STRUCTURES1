package TREES;

public class CreatingBinaryTree {

	public BinaryTree creatBinaryTree(){
		BinaryTree b=new BinaryTree(1);
		b.root.left=new Node(2);
		b.root.right=new Node(3);
		b.root.left.left=new Node(4);
		b.root.left.right=new Node(5);
		
		return b;
	}
	
	public static void main(String[] args) {
		
		
	}

}
