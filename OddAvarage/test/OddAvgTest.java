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
//  @Test
//  public void oddAverage() throws Exception {
//    ArrayList<Integer> nums = new ArrayList<>();
//    nums.add(1);
//    nums.add(2);
//    nums.add(3);
//    nums.add(4);
//    nums.add(5);
//    assertEquals(3.0, OddAvg.oddAvergae(nums), 0);
//  }
  @Test
  public void oddAverage() throws Exception {
    ArrayList<Integer> nums1 = new ArrayList<>();
    nums1.add(1);
    nums1.add(2);
    nums1.add(3);
    nums1.add(4);
    nums1.add(5);
    assertEquals(3.0, OddAvg.oddAvergae(nums1), 0);
    ArrayList<Integer> nums2 = new ArrayList();
    nums2.add(2);
    nums2.add(4);
    nums2.add(1);
    assertEquals(1.0, OddAvg.oddAvergae(nums2), 0);
    ArrayList<Integer> nums3 = new ArrayList<>();
    nums3.add(2);
    assertEquals(0.0, OddAvg.oddAvergae(nums3), 0);
  }





}