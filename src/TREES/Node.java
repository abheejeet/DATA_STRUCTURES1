package TREES;

public class Node {

	int val;
	Node left;
	Node right;
	
	Node(){
		left=null;
		right=null;
	}
	
	Node(int val){
		this();
		this.val=val;	
	}
}
