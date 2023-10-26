import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

    @Test
  public void testReversedThreeInputs() {
    int[] input1 = { 1,2,3};
    assertArrayEquals(new int[]{ 3,2,1}, ArrayExamples.reversed(input1));
  } //reversed(int[]) method returns array with every value set to 0

    @Test
  	public void testReverseInPlaceThreeInputs() {
    int[] input1 = { 1,2,3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3,2,1 }, input1);
	} // reverseInPlace creates palindrome replacing first half with second half

    @Test
  	public void testaverageWithoutLowest() {
    double[] input1 = { 10,10,30 };
    double result = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(20, result,.01);
	} 
}
