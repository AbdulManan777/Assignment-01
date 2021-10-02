package Assignment01.AP;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayTest {

	@Test
	public void PushTest() {
		
		StackArray s=new StackArray();
		s.push(6);
		s.push(8);
		s.push(11);
		s.push(13);
		StackArray s2=new StackArray();
		s2.push(15);
		s2.push(12);
		s2.push(11);
		s2.push(19);
		
		assertSame(s2.array[1],s.array[1]);
	}
	@Test
	public void PopTest() {
		
		StackArray stac= new StackArray();
		stac.push(11);
		stac.push(16);
		stac.push(21);
		stac.push(23);
		stac.push(6);
		stac.push(1);
		stac.pop();
		stac.pop();
		stac.push(7);
		
		assertEquals(7,stac.array[4]);
		
	}
	@Test
	public void StackEqualTest() {
		
		StackArray sa=new StackArray();
		sa.push(11);
		sa.push(13);
		sa.push(5);
		sa.push(9);
		sa.pop();
		StackArray expectStac=new StackArray();
		expectStac.push(11);
		expectStac.push(13);
		expectStac.push(5);
		assertArrayEquals(sa.array,expectStac.array);
		
	}
	

}
