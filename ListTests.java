import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{

	@Test 
	public void testFilter() {
    List<String> first = new ArrayList<>();
    first.add("Chest");
    first.add("Key");
    first.add("Keystone");

    StringChecker check = new StringCheckerKey(); 
    List<String> result = ListExamples.filter(first, check);
    List<String> expected = new ArrayList<>();
    expected.add("Key");
    expected.add("Keystone");
    assertEquals(expected, result);
	}


	@Test 
	public void testMerge() {
    List<String> first = new ArrayList<>();
    List<String> second = new ArrayList<>();
    List<String> merged = new ArrayList<>();
    List<String> expected = new ArrayList<>();
    first.add("Hello-");
    second.add("World");
    merged = ListExamples.merge(first,second);
    expected.add("Hello-World");
    assertEquals(expected, merged);
	}


    
}