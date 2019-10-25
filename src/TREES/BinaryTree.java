package TREES;



public class BinaryTree {

	Node root;
	
	BinaryTree(){
		root=new Node();
	}
	
	BinaryTree(int val){
		root=new Node(val);
	}
	
	
	public BinaryTree creatBinaryTree(){
		BinaryTree b=new BinaryTree(1);
		b.root.left=new Node(2);
		b.root.right=new Node(3);
		b.root.left.left=new Node(4);
		b.root.left.right=new Node(5);
		
		return b;
	}
	
	public int calcHeight(Node root){
		if(root==null){
			return 0;
		}else{
			int lheight=calcHeight(root.left);
			int rHeight=calcHeight(root.right);
			
			if(lheight>rHeight) 
				return (lheight+1);
			else
				return (rHeight+1);
		}
	}
}
