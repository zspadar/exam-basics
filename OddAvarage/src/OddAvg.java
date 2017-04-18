import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class OddAvg {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
  }

  public static double oddAvergae(List<Integer> numbers) {
    double oddAvg = 0.;
    int oddSum = 0;
    int counter = 0;
    for(int i = 0; i < numbers.size(); i ++) {
      if(numbers.get(i) % 2 != 0) {
        oddSum += numbers.get(i);
        counter++;
      }
    }
    oddAvg += oddSum / counter;
    return oddAvg;
  }
}
