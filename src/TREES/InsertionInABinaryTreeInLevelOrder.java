package TREES;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionInABinaryTreeInLevelOrder {

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
	
	public void insertAtFirstAvailablePlace(Node root,int a){
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node tempNode=q.poll();
			
			if(tempNode.left==null){
				tempNode.left=new Node(a);
				break;
			}else{
				q.add(tempNode.left);
			}
			
			if(tempNode.right==null){
				tempNode.right=new Node(a);
				break;
			}else{
				q.add(tempNode.right);
			}		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree b=new BinaryTree(10);
		b.root.left=new Node(11);
		b.root.right=new Node(9);
		b.root.left.left=new Node(7);
		b.root.right.left=new Node(15);
		b.root.right.right=new Node(8);
		InsertionInABinaryTreeInLevelOrder i=new InsertionInABinaryTreeInLevelOrder();	
		i.insertAtFirstAvailablePlace(b.root,12);
		i.printLevelOrderTraversal(b.root);
	}

}
