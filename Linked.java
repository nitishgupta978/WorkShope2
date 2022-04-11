package com.bridglabz.oops.ds.LinkedByGen;
class Node {
	
	int data;
	Node NextRefofNode;
	
	public Node(int data) {
		super();
		this.data = data;
		NextRefofNode= null;
		
		
	}
	
}
public class Linked {
	public static void main(String[] args) {
		Node node1=new Node(100);
		Node node2= new Node(200);
		Node node3= new Node(300);
		// John  its not work becouse we use string if you want to try so use Genric data types
		//Node node4= new Node("JohnWick");
		
		
		node1.NextRefofNode = node2;
		node2.NextRefofNode = node3;
		
		
		Println(node1);
		
	}

	public static void Println(Node head) {
		Node temp = head;
		System.out.print(" "+temp.data+ "-->");
		while(temp!=null) {
			System.out.print(" "+temp.data+ "-->");
			temp = temp.NextRefofNode;
			
		}
		
		
		
	}
}

