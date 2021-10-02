package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArray2Test {

	@Test(expected=java.lang.Exception.class)
	public void EnqueueExceptionTest() throws Exception {
		
		QueueArray2 Qa=new QueueArray2(5);
		Qa.enqueue(4);
		Qa.enqueue(7);
		Qa.enqueue(9);
		Qa.enqueue(10);
		Qa.enqueue(12);
		Qa.enqueue(13);
		
		
	}
	
	@Test(expected=java.lang.Exception.class)
	public void DequeueExceptionTest()  throws Exception{
		
		QueueArray2 Qa=new QueueArray2(5);
		Qa.dequeue();
		
		
	}
	
	@Test
	public void SimpleQueueTest() throws Exception {// Bug found here
		
		QueueArray2 Qa=new QueueArray2(5);
		Qa.enqueue(4);
		Qa.enqueue(1);
		Qa.enqueue(7);
		Qa.dequeue();
		Qa.enqueue(21);
		Qa.dequeue();
		Qa.dequeue();
		Qa.display();
		System.out.println("Bug here because 4 is dequed from the Queue but it is still in array= "+Qa.array[0]);
		int value=21;
		assertEquals(value,Qa.array[0]);//bug here because 4 is dequeued but still comes and test case fails
		
		
	}

}
