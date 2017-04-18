import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Deck {
  private ArrayList<Card> cards;
  private ArrayList<String> colors;

  public Deck(int number {
    colors = new ArrayList<>();
    colors.add("Clubs");
    colors.add("Diamonds");
    colors.add("Hearts");
    colors.add("Spades");

    for (int i = 0; i < number; i++) {
      int color = number % (colors.size() - 1);
    }
    createDeck();
  }




  private void createDeck() {
    for (int i = 0; i < colors.size(); i++) {
      cards.add(new Card(colors.get(i), "Ace", 1));
      cards.add(new Card(colors.get(i), "2", 2));
      cards.add(new Card(colors.get(i), "3", 3));
      cards.add(new Card(colors.get(i), "4", 4));
      cards.add(new Card(colors.get(i), "5", 5));
      cards.add(new Card(colors.get(i), "6", 6));
      cards.add(new Card(colors.get(i), "7", 7));
      cards.add(new Card(colors.get(i), "8", 8));
      cards.add(new Card(colors.get(i), "9", 9));
      cards.add(new Card(colors.get(i), "10", 10));
      cards.add(new Card(colors.get(i), "Jack", 10));
      cards.add(new Card(colors.get(i), "Queen", 10));
      cards.add(new Card(colors.get(i), "King", 10));
    }

    Collections.shuffle(cards);
  }
  public Card draw() {
    if(cards.size() > 0) {
      Card card = cards.get(cards.size() - 1);
      cards.remove(cards.size() -1);
      return card;
    }
    return null;
  }
  

}
