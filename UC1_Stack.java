package StackAndQueue;

public class UC1_Stack {
	
	Node top;
	int size;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {		
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;

		size++;
	}
	
    public void print(){		
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
    }

	
public static void main(String[] args) {
	System.out.println("Welcome to the Stack And Queue Problem");
	UC1_Stack stack = new UC1_Stack();
	stack.push(70);
	stack.push(30);
	stack.push(56);
	System.out.println("Stack  list is :: ");
	stack.print();
}
}