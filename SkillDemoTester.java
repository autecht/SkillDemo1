import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void findMaxTester(){
        int[] input = {1, 2, 3, 4};
        assertEquals(5, SkillDemo1.findMax(input));
    }

}
