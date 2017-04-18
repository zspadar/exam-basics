/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class BlackJackApp {
  public static void main(String[] args) {
    Deck deck = new Deck(18);
    System.out.println(deck);

    Card drawn = deck.draw();
    System.out.println(drawn);
    System.out.println(deck);
  }
}
