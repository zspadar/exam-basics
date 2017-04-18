import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class OddAvgTest {
  @Before
  public void before() {
    System.out.println("Before");
  }
  @Test
  public void oddAverage() throws Exception {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    assertEquals(3.0, OddAvg.oddAvergae(nums), 0);
  }


}