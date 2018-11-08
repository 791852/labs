import java.util.ArrayList;
/**
 * Write a description of class DeckClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    ArrayList <Card> deck = new ArrayList <Card> (); //this creates a new arraylist (a deck)
    public Deck(){
        for(int r = 1; r<14; r ++){ //this will go through from 1 to 13, all the options for rank
            for(int s = 0; s<4; s++){ //this will go from 0 to 3, since there are four suit options
                if(s ==0){ //these if statements give the program 4 options for 4 different suits
                deck.add(new Card(r, "Heart"));
                }
                if(s ==1){
                deck.add(new Card(r, "Diamond"));
                }
                if(s ==2){
                deck.add(new Card(r, "Spade"));
                }
                if(s ==3){
                deck.add(new Card(r, "Club"));
                }
            }
        }
    }
    public Card getCard(){ //this allows me to access a card from the deck later
        return deck.get((int)(Math.random()*52));
    }
}
