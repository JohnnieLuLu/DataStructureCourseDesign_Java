package Alpha;

public class GenNode<T> {
	public T data;
	public GenList<T> child;
	public GenNode<T> next;
	public GenNode(T data, GenList<T> child, GenNode<T> next){
		this.data = data;
		this.child = child;
		this.next = next;
	}
	public GenNode(T data){}
	public GenNode(){
		this(null,null,null);
	}
	public String toString(){
		return this.data.toString();
	}
	

}
