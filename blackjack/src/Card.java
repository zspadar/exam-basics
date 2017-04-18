/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Card {
  private String color;
  private String name;
  private  int value;

  public Card(String color, String name, int value) {
    this.color = color;
    this.name = name;
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public int getValue() {

    return value;
  }
}
