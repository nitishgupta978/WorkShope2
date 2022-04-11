package com.bridglabz.oops.ds.LinkedByGen;
class Nodes <T>{
	T data;
	Nodes NextRefOfNodes;
	
	public Nodes(T data) {
		super();
		this.data = data;
	NextRefOfNodes= null;
		
	}
}

public class LinkUseGenrich {
	static Nodes head;
	
	
	public static void main(String[] args) {
//		Nodes node1= new Nodes(100);
//		Nodes node2= new Nodes(200);
//		Nodes node3= new Nodes(300);
//		Nodes node4= new Nodes("John");
//		
//		node1.NextRefOfNodes=node2;
//		node2.NextRefOfNodes=node3;
//		node3.NextRefOfNodes=node4;
		add(100);
		add(200);
		add(300);
		add("John");
		
		
		Println();
		
	}
	public static void Println() {
		Nodes temp = head;
	//	System.out.print(" "+temp.data+ " --->");
		while(temp!=null) {
			System.out.print(" "+temp.data+ " --->");
			temp=temp.NextRefOfNodes;
			
		}
	}
	public static<T> void add(T data) {
		Nodes temp = head;
		
		Nodes newNodes = new Nodes( data);
		if (temp == null) {
		head=newNodes;
		}
		else {
			while(temp.NextRefOfNodes!=null) {
			temp=temp.NextRefOfNodes;
		}
		temp.NextRefOfNodes= newNodes;
		
		
	}
}
}

