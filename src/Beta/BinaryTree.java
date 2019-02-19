package Beta;

public class BinaryTree<T> {
	public BinaryNode<T> root;
	public BinaryTree(){
		this.root = null;
	}
	public boolean isEmpty(){
		return this.root == null ;
	}
	
	public void printGenList(){
		System.out.print("二叉树的广义表表示：");
		printGenList(this.root);
		System.out.println();
	}
	public void printGenList(BinaryNode<T> p){
		if(p == null)
			System.out.print("^");
		else{
			System.out.print(p.data.toString() + "");
			if(p.left != null || p.right != null){
				System.out.print("(");
				printGenList(p.left);
				System.out.print(",");
				printGenList(p.right);
				System.out.print(")");
			}
		}
	}
	public boolean isEqual(BinaryNode<T> p, BinaryNode<T> r){
		if(p == null && r == null)
			return true;
		if(p != null && r == null)
			return false;
		if(p == null && r != null)
			return false;
		else{
			if(p.data.equals(r.data))
				return isEqual(p.left,r.left) && isEqual(p.right, r.right);
			else return false;
		}
	}
	public boolean eaqual(BinaryTree p){
		return isEqual(this.root,p.root);
	}
	
}
