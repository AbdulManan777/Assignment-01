package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QueueArrayTest {

	@Test
	public void EneuqeTest() {
		
		QueueArray QA=new QueueArray(5);
		QA.enqueue(5);
		QA.enqueue(7);
		QA.enqueue(11);
		QA.enqueue(12);
		QA.enqueue(18);
	
		int[] arr= {5,7,11,12,18,0};
		
		assertArrayEquals(arr,QA.array); /*Bug identified here Size is different of both expected
		                                 and actual array but still test case passes*/
		
		
	}
	
	@Test
	public void DequeueTest() {
		
		QueueArray Q=new QueueArray(7);
		Q.enqueue(5);
		Q.enqueue(7);
		Q.enqueue(13);
		Q.enqueue(17);
		Q.dequeue();
		int  dq=Q.dequeue();
		Q.enqueue(15);
		assertEquals(7,dq);
	}
	
	@Test
	public void ElementInsertTest() {// Bug identified here also
		
		QueueArray Q=new QueueArray(5);
		Q.enqueue(8);
		Q.enqueue(17);
		Q.enqueue(21);
		Q.enqueue(23);
		Q.dequeue();
		Q.enqueue(26);
		
		Q.dequeue();
		Q.enqueue(3);
		Q.dequeue();
		System.out.println("Bug because 8 is dequeud but still is printed from Q ="+Q.array[0]);
		Q.display();
		int expectnum=26;
		assertEquals(expectnum,Q.array[1]); // should be 26 but 17 as it is dequeued comes and test case fails
	}

}
