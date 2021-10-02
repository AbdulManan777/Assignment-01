package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Assignment01.AP.LinkedList.Node;

public class LinkedListTest {
    private LinkedList link;
    
    @Before
    public void LinkedListTesting() {
    	
    	System.out.println("Linked list testing begins from here");
    }
	@Test
	public void NULLTest() {
		
	    
		assertNull(link);
	}
	
	@Test
	public void InsertionFrontTestofHeads() {
		link.pushFront(4);
		link.pushFront(7);
		link.pushFront(6);
		//link.display();
		LinkedList expectLink=new LinkedList();
		expectLink.pushFront(4);
		
	      
		  assertEquals(expectLink.head,link.head);
		  
		}
	
	
   @Test
   public void ElementFindTest() {
	   
	   link.pushFront(3);
	   link.pushFront(7);
	   link.pushFront(12);
	   link.pushFront(14);
	   
	   int count=0;
	   Node curr=link.head;
	   while(count<=2) {
		   curr=curr.next;
		   count++;
	   }
	   assertEquals(3,curr.key);
   }
   @Test
   public void PopElementTest() {
	   LinkedList l=new LinkedList();
	   l.pushBack(2);
	   l.pushBack(5);
	   l.pushBack(14);
	   l.pushBack(20);
	   
	   l.pop(3);
	   l.display();
	   int count=0;
	   Node curr=l.head;
	   while(count<2) {
		   
		   curr=curr.next;
		   count++;
		   
	   }
	   assertNotEquals(20,curr.key);
   }
   @Test
   public void TraversalElemnetsNULLTest() {
	   
	   LinkedList list1=new LinkedList();
	   
	   list1.pushFront(4);
	   list1.pushBack(21);
	   list1.pushBack(34);
	   list1.pushFront(16);
	   //list1.display();
	   int count=0;
	   Node curr=list1.head;
	   while(count<=3) {
		   
		   curr=curr.next;
		   count++;
	   }
	   assertNull(curr);
   }
   @Test
   public void EqualElementsTest() {
	   
	   LinkedList lis=new LinkedList();
	   
	   lis.pushFront(6);
	   lis.pushBack(32);
	   lis.pushBack(71);
	   lis.pushFront(44);
	   lis.popBack();
	   LinkedList check=new LinkedList();
	   check.pushBack(44);
	   check.pushBack(6);
	   check.pushBack(32);
	   int count=0;
	   Node curr1=lis.head;
	   Node curr2=check.head;
	   while(count<=2) {
		   
		   assertEquals(curr1.key,curr2.key);
		   curr1=curr1.next;
		   curr2=curr2.next;
		   count++;
	   }
   }
   
  
	   
	   
	  
   }
	
	
	


