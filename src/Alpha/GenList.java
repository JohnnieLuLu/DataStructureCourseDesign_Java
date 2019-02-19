package Alpha;

public class GenList<T> {
	public GenNode<T> head;
	public GenList(){
		this.head = new GenNode<T>();
	}
	public String toString(){
		return this.toString("");
	}
	public String toString(String str){
		str += "(";
		for(GenNode<T> p = this.head.next; p != null; p = p.next){
			if(p.child == null)
				str += p.data.toString();
			else str += p.child.toString();
			if(p.next != null)
				str += ",";
		}
		return str + ")";
	}
	
}
