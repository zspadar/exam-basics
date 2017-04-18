import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Deck {
  private ArrayList<Card> cards;
  private ArrayList<String> colors;

  public Deck(int number) {
    this.cards = new ArrayList<>();
    this.colors = new ArrayList<>();
    colors.add("Clubs");
    colors.add("Diamonds");
    colors.add("Hearts");
    colors.add("Spades");
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    for (int i = 0; i < number; i++) {
      int color = i % (colors.size());
      int value = cards.size() / colors.size();
      cards.add(new Card(colors.get(color), values[value]));

    }

  }



  public void shuffle() {
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

  public String toString () {
    String[] colorStatus = new String[colors.size()];
    for(int i = 0; i < colors.size(); i++) {
      int colorSum = 0;
      for(int j = 0; i < cards.size(); j++) {
        if((colors.get(i).equals(cards.get(j).getColor()))) {
          colorSum++;
        }
      }
      colorStatus[i] = String.valueOf(colorSum) + " " + colors.get(i);
    }
    String status = String.format("%d cards - %s", String.valueOf(cards.size()), String.join(", ", colorStatus));
    return status;
  }
}

