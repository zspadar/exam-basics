/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Card {
  private String color;
  private String value;


  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return value + " " + color;
  }

}


