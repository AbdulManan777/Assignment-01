package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueTest {

	@Test
	public void addLeftTest() {
		
		Dequeue DQ=new Dequeue(5);
		DQ.addLeft(30);
		DQ.addLeft(32);
		DQ.addLeft(21);
		DQ.addLeft(36);
		DQ.addLeft(34);
		int arr[]= {30,32,21,36,34};
		assertArrayEquals(arr,DQ.array);
		
	}
	
	@Test
	public void addRightTest() {
		
		Dequeue DQ=new Dequeue(5);
		DQ.addRight(6);
		DQ.addRight(43);
		DQ.addLeft(7);
		DQ.addLeft(9);
		DQ.addRight(21);
		DQ.addLeft(3); /* Bug here because the actual length of array was 5, so it should give an error
		                after 6thinsertion but it inserts it and test case passes*/
		
		assertEquals(21,DQ.array[2]);
		
		
	}

}
