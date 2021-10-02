package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment01.AP.CircularLinkedList.Node;
import Assignment01.AP.Queue;
public class QueueLinkedListTest {

	@Test
	public void EnqueueTest() {
		
		Queue Q=new Queue();
		
		Q.enqueue(5);
		Q.enqueue(17);
		Q.enqueue(21);
		Q.enqueue(26);
		Q.enqueue(55);
		Q.enqueue(20);
		Queue expectQ=new Queue();
		expectQ.enqueue(5);
		expectQ.enqueue(17);
		expectQ.enqueue(21);
	    expectQ.enqueue(26);
		expectQ.enqueue(55);
		expectQ.enqueue(20);
		
		Assignment01.AP.Queue.Node Traverse1=Q.head;
		Assignment01.AP.Queue.Node Traverse2=expectQ.head;
		
		while(Traverse1!=null||Traverse2!=null) {
			
			assertEquals(Traverse2.key,Traverse1.key);
			Traverse1=Traverse1.next;
			Traverse2=Traverse2.next;
		}
	}
	
	@Test
	public void NULLQueueTest() {
		
		Queue Q=new Queue();
		Q.enqueue(5);
		Q.enqueue(20);
		Q.enqueue(2);
		Q.enqueue(7);
		Q.enqueue(32);
		Q.enqueue(12);
		Assignment01.AP.Queue.Node curr=Q.head;
		int count=0;
		while(count<6) {
			curr=curr.next;
			count++;
			
		}
		assertNull(curr);
	}
	
	@Test
	public void DequeueTest() {
		
		Queue Q=new Queue();
		Q.enqueue(6);
		Q.enqueue(21);
		Q.enqueue(24);
		Q.dequeue();
		Q.enqueue(8);
		Q.dequeue();
		Q.dequeue();
		Q.enqueue(7);
		
		Assignment01.AP.Queue.Node curr=Q.head;
		curr=curr.next;
		assertEquals(7,curr.key);
		
		
	}
	
	@Test
	public void QueueElementTest() {
		
		Queue Q=new Queue();
		Q.enqueue(5);
		Q.enqueue(8);
		Q.enqueue(1);
		Q.dequeue();
		Q.enqueue(87);
		Q.dequeue();
		Q.dequeue();
		Q.enqueue(6);
		Q.enqueue(55);

		Assignment01.AP.Queue.Node curr=Q.head;
		curr=curr.next;
		curr=curr.next;
		assertTrue(curr.key > 50);
		
		
		
	}
	
	@Test
	public void EmptyQueueTest() {
		
		Queue Q=new Queue();
		Q.enqueue(5);
		Q.enqueue(8);
		Q.enqueue(1);
		Q.dequeue();
		Q.enqueue(87);
		Q.dequeue();
		Q.dequeue();
		Q.enqueue(6);
		Q.enqueue(55);
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Assignment01.AP.Queue.Node curr=Q.head;
		assertNull(curr);
		
	}
}
