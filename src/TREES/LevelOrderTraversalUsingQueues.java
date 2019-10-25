package TREES;

import java.util.LinkedList;
import java.util.Queue;


//O(n) complexity
public class LevelOrderTraversalUsingQueues {

	public void printLevelOrderTraversal(Node root){
		if(root==null)
			return;
		else{
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()){
				Node tempNode=q.poll();
				System.out.println(tempNode.val);
				if(tempNode.left!=null){
					q.add(tempNode.left);
				}
				
				if(tempNode.right!=null){
					q.add(tempNode.right);
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b=b.creatBinaryTree();
		LevelOrderTraversalUsingQueues l =new LevelOrderTraversalUsingQueues();
		l.printLevelOrderTraversal(b.root);
		
	}

}
