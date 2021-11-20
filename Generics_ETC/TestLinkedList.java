/**
 * TestLinkedList.java
 * This class tests the LinkedList and GenericLinkedList classes by adding nodes with specific object types. The lists will be printed out to ensure they are working properly
 * 
 * @author rkelley/njohnson/Ethan Craycroft
 * Programming Project 3 Start Project
 * CS131ON
 */
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;


public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		
		System.out.println();
	
		
		/*
		 * ---------------------------------------------------------------------------------------------------------
		 * Testing the GenericLinkedList class by passing in integer objects		 		 
		 * ---------------------------------------------------------------------------------------------------------
		 */
		
		System.out.println("Generic Linked List with Integers:");
		GenericLinkedList<Integer> myGenericIntList = new GenericLinkedList<Integer>();
		
		GenericNode<Integer>  myIntNode = new GenericNode<Integer>();
		myIntNode.setData(1);
		myGenericIntList.addNode(myIntNode);
		myIntNode = new GenericNode<Integer>();
		int element1 = 14;
		myIntNode.setData(element1);
		myGenericIntList.addNode(myIntNode);
		
		GenericNode<Integer> temporaryIntNode = myGenericIntList.getList();
		do 
		{
			System.out.println(temporaryIntNode.getData());
			temporaryIntNode=temporaryIntNode.getNextNode();
		} 
		while (temporaryIntNode!=null);
		
		
		System.out.println();
	
		
		/*
		 * ---------------------------------------------------------------------------------------------------------
		 * Testing the GenericLinkedList class by passing in double objects		 		 
		 * ---------------------------------------------------------------------------------------------------------
		 */
		
		System.out.println("Generic Linked List with Doubles:");
		GenericLinkedList<Double> myGenericDoubleList = new GenericLinkedList<Double>();
		
		GenericNode<Double>  myDoubleNode = new GenericNode<Double>();
		myDoubleNode.setData(2134.12);
		myGenericDoubleList.addNode(myDoubleNode);
		myDoubleNode = new GenericNode<Double>();
		myDoubleNode.setData(34.342);
		myGenericDoubleList.addNode(myDoubleNode);
		
		GenericNode<Double> temporaryDoubleNode = myGenericDoubleList.getList();
		do
		{
			System.out.println(temporaryDoubleNode.getData());
			temporaryDoubleNode=temporaryDoubleNode.getNextNode();
		} 
		while (temporaryDoubleNode!=null);

		System.out.println();
	
		
		/*
		 * ---------------------------------------------------------------------------------------------------------
		 * Testing the GenericLinkedList class by passing in String objects		 		 
		 * ---------------------------------------------------------------------------------------------------------
		 */
		
		System.out.println("Generic Linked List with Strings:");
		GenericLinkedList<String> myGenericStringList = new GenericLinkedList<String>();
		
		GenericNode<String>  myStringNode = new GenericNode<String>();
		myStringNode.setData("String number 1");
		myGenericStringList.addNode(myStringNode);
		myStringNode = new GenericNode<String>();
		myStringNode.setData("String number 2");
		myGenericStringList.addNode(myStringNode);
		
		GenericNode<String> temporaryStringNode = myGenericStringList.getList();
		do
		{
			System.out.println(temporaryStringNode.getData());
			temporaryStringNode=temporaryStringNode.getNextNode();
		} 
		while (temporaryStringNode!=null);

		System.out.println();
		
	}//end main

}//end class
