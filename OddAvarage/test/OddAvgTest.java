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
  public double oddAvergae() throws Exception {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    

    assertEquals(2.0, oddAvergae(numbers));

  }


}