package com.h.dsa;

public class LLInsertion {
      class Node{
    	  int data;
    	  Node next;
    	  
    	  Node(int data){
    		  this.data = data;
    		  this.next = null;
    	  }
      }
      
       Node head;
       Node tail=null;  
      public void addFirst(int data) {
    	  Node newNode = new Node(data);
    	  if(head==null) {
    		  head = newNode;
    		  tail = newNode;
    		  return;
    	  }
    		
    	  newNode.next = head;
    	  head = newNode;
      }
      
  
      public void addLast(int data) {
    	 Node newNode = new Node(data);
    	 if(head==null) {
    	     head = newNode;
    		 tail = newNode;
    		 return;
    	 }
    	 
    	 tail.next=newNode;
    	 tail = newNode;
      }
      
      public void insertAtAnyPoint(int indx,int data) {
    	  Node newNode = new Node(data);
    	  Node temp = head;
    	  for(int i=1;i<=indx-1;i++) {
    		  temp = temp.next;
    	  }
    	  newNode.next = temp.next;
    	  temp.next=newNode;
      }
      
      public void print() {
    	  Node current = head;
    	  while(current!=null) {
    		  System.out.print(current.data + " ");
    		  current=current.next;
    	  }
      }
      
      
      public static void main(String args[]) {
    	  LLInsertion list = new LLInsertion();
    	  list.addFirst(3);
    	  list.addFirst(2);
    	  
    	  list.addFirst(1);
    	  list.addLast(5);
    	  list.insertAtAnyPoint(3, 4);
    	  
    	  list.print();
    	  
     }
}
