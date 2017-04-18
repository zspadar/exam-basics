import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
    ArrayList<Integer> nums1 = new ArrayList<>();
    nums1.add(1);
    nums1.add(2);
    nums1.add(3);
    nums1.add(4);
    nums1.add(5);
    assertEquals(3.0, OddAvg.oddAverage(nums1), 0);
    ArrayList nums2 = new ArrayList();
    nums2.add(2);
    nums2.add(4);
    assertEquals(0.0, OddAvg.oddAverage(nums2), 0);
    ArrayList<Integer> nums3 = new ArrayList<>();
    assertEquals(0.0, OddAvg.oddAverage(nums3), 0);
  }
}