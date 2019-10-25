package TREES;

import java.util.Stack;

public class InorderTraversal {

	
	//with recursion
	public void printSubtree(Node n){
		if(n==null)
			return;
		else{
				printSubtree(n.left);
				System.out.print(n.val);
				printSubtree(n.right);
		}			
	}
	
	//without recursion
	/*
	 * 3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.
	 * 
	 */
	public void printSubtreeIterative(Node n){
		if(n==null)
			return;
		else{
			Stack<Node> s=new Stack<>();
			
			s.add(n);
			while(!s.isEmpty()){
				Node tempNode=s.peek();
				
				if(tempNode.left!=null){
					s.add(tempNode.left);
					//tempNode=tempNode.left;
				}else{
					s.pop();
					System.out.print(tempNode.val);
					if(tempNode.right!=null){
						s.add(tempNode.right);
					}
				}
				
				/*else{
					s.pop();
					System.out.print(tempNode.val);
				}
				
				if(tempNode.right!=null){
					s.add(tempNode.right);
				}*/
				
			}
		}
	}
	
	public void printInorderTraversal(Node n){
		printSubtree(n);
		printSubtreeIterative(n);
	}
	
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree(1);
		b.root.left=new Node(2);
		b.root.right=new Node(4);
		b.root.left.right=new Node(3);
		b.root.right.left=new Node(5);
		b.root.right.left.left=new Node(6);
		b.root.right.right=new Node(7);
		b.root.right.right.left=new Node(8);
		b.root.right.right.right=new Node(9);
		
		InorderTraversal inorderTraversal=new InorderTraversal();
		inorderTraversal.printInorderTraversal(b.root);
	
	}

}
