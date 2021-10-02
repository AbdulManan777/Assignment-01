package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import Assignment01.AP.Array;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayTest {

	private Array a=new Array();
    
	@Test
	public void TestFullArrayInsert() {
		
		
		//int numElements= 6;
		
		
		
		a.insert(7,3);
		a.insert(2,1);
		a.insert(5,4);
		a.insert(9,0);
		
	
		
		assertEquals(true,a.linearSearch(2));
		
		
	}
	@Test
	public void ArrayDelTest() {
		
		a.insert(7,3);
		a.insert(2,1);
		a.insert(5,4);
		a.insert(9,0);
		a.delete(4);
		assertNotEquals(true,a.binarySearch(5,0,3));
	}
		@Test
		public void BuubleSortTest() {
			
			Array expect=new Array();
			
			a.insert(6, 0);
			a.insert(1, 2);
			a.insert(7, 4);
			a.bubbleSort();
			expect.insert(0, 0);
			expect.insert(1, 1);
			expect.insert(6, 2);
			
			assertArrayEquals(expect.array,a.array);
			
		}
	
	
	@Test
	public void GreaterArrayCheck() {
		
		a.insert(4,0);
		a.insert(1, 1);
		a.insert(6, 2);
		
		
		
		Array Expect=new Array();
		
		Expect.insert(7,0);
		Expect.insert(3, 1);
		Expect.insert(5, 2);
		
		assertTrue(Expect.array[1] < a.array[0]);
		
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void ArrayInsertionTest() throws Exception {
		
		ArrayInsertion arra=new ArrayInsertion();
		
		int arr1[]=new int[5];
		int expArray[]= {4,5,6,7,8};
		int j=4;
		for(int i=0;i<5;i++,j++) {
			
			arr1=arra.insert(arr1, j, i);
		}
		assertEquals(0,1);
		
		
	}
		
	@Test(timeout=1000)
	public void TimeTestBubbleSort()throws InterruptedException {
		
		a.bubbleSort();
	}
		
	
	
	
}

