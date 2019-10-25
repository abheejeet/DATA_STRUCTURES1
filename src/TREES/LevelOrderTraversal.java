package TREES;

//O(n^2) complexity

public class LevelOrderTraversal {

	public void printLevelOrderTraversal(Node root,int height){
		for(int i=1;i<=height;i++){
			printNodesAtALevel(root,i);
		}
	}
	
	public void printNodesAtALevel(Node n,int level){
		if(n==null){
			return;
		}else if(level==1){
			System.out.println(n.val);
		}else{
			printNodesAtALevel(n.left,level-1);
			printNodesAtALevel(n.right,level-1);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b=b.creatBinaryTree();
		LevelOrderTraversal l =new LevelOrderTraversal();
		l.printLevelOrderTraversal(b.root, b.calcHeight(b.root));
		//System.out.println(b.calcHeight(b.root));
		
		
	}

}
