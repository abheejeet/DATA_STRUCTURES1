package TREES;

public class LeftView {

	static int max_level=0;
	void leftView(Node root){
		leftViewUtil(root,1,0);
		
	}
	
	int leftViewUtil(Node root, int level,int maxLevel){
		if(root==null)
			return maxLevel;
		
		if(maxLevel<level)
		{
			System.out.print(root.val+" ");
			maxLevel=level;
			
		}
		maxLevel=leftViewUtil(root.left, level+1,maxLevel);
		maxLevel=leftViewUtil(root.right, level+1,maxLevel);
		return maxLevel;
	}

	public static void main(String[] args) {
		BinaryTree b=new BinaryTree(1);
		b.root.left=new Node(2);
		b.root.right=new Node(3);
		b.root.left.left=new Node(4);
		b.root.right.left=new Node(5);
		b.root.right.left.left=new Node(6);
		
		LeftView l=new LeftView();
		l.leftView(b.root);
	}

}
