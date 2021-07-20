package StackAndQueue;

public class UC2_StackPeakAndPop {
	public class Node {
		int data;
		Node next;
	}

	public void print() {
		Node head = null;
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public class Node1 {
		int data;
		Node next;
	}

	private Node top;

	public void Stack() {
		this.top = null;
	}

	// method to push data on stack
	public void push(int x) {
		Node node = new Node();
		System.out.println("Inserting... " + x);
		node.data = x;
		node.next = top;
		top = node;
	}

	// method to check if stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	// method to retrieve the top element from stack
	public int peak() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("The stack is empty");
			return -1;
		}
	}

	// removing the data from stack
	public void pop() {
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		System.out.println("Removing... " + peak());
		top = (top).next;
	}

	public static void main(String[] args) {
		UC2_StackPeakAndPop stack = new UC2_StackPeakAndPop();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println("The Top Element is : " + stack.peak());

		stack.pop();
		stack.pop();
		stack.pop();

		if (stack.isEmpty()) {
			System.out.print("The Stack is Empty");
		} else {
			System.out.print("The Stack is Not Empty");
		}
	}

	
	
}
