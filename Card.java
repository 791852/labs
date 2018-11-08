
/**
 * Write a description of class CardClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
   private int rank;
   private String suit;
   public Card( int rank, String suit){ //gives the card a rank and a suit
    rank = rank;
    suit = suit;
    }
   public String getSuit(){ //this allows me to access the suit later
    return suit;
    }
   public int getRank(){ //this allows me to access the rank later
    return rank;
    }
}
