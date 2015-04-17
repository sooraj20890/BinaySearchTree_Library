
public class Node {
	
	private int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getlLink() {
		return lLink;
	}
	public void setlLink(Node lLink) {
		this.lLink = lLink;
	}
	public Node getrLink() {
		return rLink;
	}
	public void setrLink(Node rLink) {
		this.rLink = rLink;
	}
	private Node lLink;
	private Node rLink;

}
