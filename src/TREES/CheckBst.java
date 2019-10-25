package TREES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class CheckBst {

	/*static int postOrderTraversal(Node root,int maxVal){
		if(root==null)
			return 0;
		if(node.val)
		postOrderTraversal(root.left, maxVal);
		postOrderTraversal(root.right, maxVal);
		System.out.println(root.val);
	}
	*/
	static boolean checkIfArrayListIsSorted(List<Integer> a){
	
		boolean ascending = true, descending = true;
		int[] arr=new int[a.size()];
		for(int i=0;i<a.size();i++)
			arr[i]=a.get(i);
		for (int i = 1; i < arr.length && (ascending || descending); i++) {
		    ascending = ascending && arr[i] >= arr[i-1];
		    descending = descending && arr[i] <= arr[i-1];
		}
		return ascending;
	}
	 static void isBST(Node root,List<Integer> a){  
		 if(root==null)
			 return;
		 
		 isBST(root.left,a);
		 a.add(root.val);
		 isBST(root.right,a);
		 
	  }
	
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree(10);
		b.root.left=new Node(7);
		b.root.right=new Node(39);
		b.root.left.left=new Node(11);
		List<Integer> a=new ArrayList<>();
		isBST(b.root,a);
		if(checkIfArrayListIsSorted(a)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}

}
