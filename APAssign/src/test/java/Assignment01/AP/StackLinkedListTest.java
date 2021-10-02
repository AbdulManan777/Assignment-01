package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Test;

import Assignment01.AP.CircularLinkedList.Node;
import Assignment01.AP.Stack;
public class StackLinkedListTest {

	@Test
	public void TopStackTest() {
		Stack s=new Stack();
		s.push(5);
		s.push(9);
		s.push(7);
		s.push(1);
		assertEquals(1,s.top());
	}
	
	@Test
	public void PushStackTraversalTest() {
		
		Stack sac=new Stack();
		sac.push(15);
		sac.push(21);
		sac.pop();
		sac.push(23);
		sac.push(32);
		sac.push(21);
		sac.pop();
		sac.push(25);
		sac.display();
		Stack expectStack=new Stack();
		expectStack.push(15);
		expectStack.push(23);
		expectStack.push(32);
		expectStack.push(25);
		expectStack.display();
		Assignment01.AP.Stack.Node curr=sac.head;
		Assignment01.AP.Stack.Node curr2=expectStack.head;
	
		while(curr!=null) {
			assertEquals(curr.key,curr2.key);
			curr=curr.next;
			curr2=curr2.next;
			
		}
		
	}
	@Test
    public void NullTest() {
		
		Stack s=new Stack();
		s.push(4);
		s.push(11);
		s.push(8);
		s.push(23);
		s.pop();
		s.push(43);
		Assignment01.AP.Stack.Node n=s.head;
		int i=0;
		while(i<4) {
			n=n.next;
			i++;
		}
		assertNull(n);
		
	}
	
	
	@Test
	public void SizeTest() {
		
		Stack sa=new Stack();
		
		sa.push(21);
		sa.push(5);
		sa.push(55);
		sa.pop();
		sa.pop();
		sa.push(7);
		assertEquals(2,sa.getSize());
	}
	@Test
	public void ElementTest() {
		
		Stack sa=new Stack();
		
		sa.push(12);
		sa.push(76);
		sa.push(55);
		sa.push(32);
		sa.push(43);
		sa.push(21);
		sa.pop();
		sa.pop();
		sa.push(42);
		sa.push(31);
		sa.pop();
		sa.display();
		Assignment01.AP.Stack.Node curr=sa.head;
		int count=0;
		while(count<3) {
			
			curr=curr.next;
			count++;
			
		}
		assertEquals(76,curr.key);
		assertNotEquals(12,sa.top());
		
	}

}
