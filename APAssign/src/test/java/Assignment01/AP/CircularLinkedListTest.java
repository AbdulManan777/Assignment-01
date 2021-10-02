package Assignment01.AP;

import static org.junit.Assert.*;



import org.junit.Test;

import Assignment01.AP.CircularLinkedList.Node;

//import Assignment01.AP.CircularLinkedList.Node;



public class CircularLinkedListTest {

	@Test
	   public void CircularListTestTraversal() {
		   
		   CircularLinkedList cl=new CircularLinkedList();
		   cl.pushBack(0);
		   cl.pushBack(7);
		   cl.pushFront(12);
		   cl.pushBack(42);
		   cl.pushFront(5);
		  
		   int count=0;
		   Node curr=cl.head;
		   while(count<=4) {
			   curr=curr.next;
			   count++;
		   }
		   assertSame(cl.head,curr);
		   
	   }
	@Test
	public void CircularGreaterTest() {
		
		   CircularLinkedList cl1=new CircularLinkedList();
		   cl1.pushBack(7);
		   cl1.pushBack(9);
		   cl1.pushFront(13);
		   cl1.pushBack(40);
		   cl1.pushFront(32);
		   cl1.popFront();
		   Node curr=cl1.head;
		   int count=0;
		   while(count<=1) {
			   curr=curr.next;
			   count++;
			   
		   }
		   assertTrue(curr.key < 10);
	}
	@Test
	public void CircularPopTest() {
		
		CircularLinkedList cir=new CircularLinkedList();
        cir.pushFront(23);
        cir.pushBack(12);
        cir.pushBack(76);
        cir.pushFront(55);
        cir.pushBack(23);
        cir.popBack();
        cir.popFront();
        int count=0;
        Node curr=cir.head;
        while(curr.next!=cir.head) {
        	curr=curr.next;
        	count++;
        }
        assertEquals(2,count);
	
	
}
	
	@Test
	public void SwapListTest() {
		
		LinkedListSwapNodes ls=new LinkedListSwapNodes();
		ls.pushBack(3);
		ls.pushFront(5);
		ls.pushBack(8);
		ls.pushFront(1);
		Assignment01.AP.LinkedListSwapNodes.Node curr=ls.head;
		ls.swap();
		int count=0;
		assertEquals(8,curr.key);
		while(count<=2) {
			curr=curr.next;
			count++;
		}
		assertEquals(1,curr.key);
		
		
	}
}
