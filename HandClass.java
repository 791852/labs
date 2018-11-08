import java.util.ArrayList;
/**
 * Write a description of class HandClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HandClass
{
    ArrayList <Card> hand = new ArrayList<Card> (); //this creates a hand arrayList
    public HandClass(Deck deckObject){
        for(int i =0; i<5; i++){ //this loads it with randomly chosen cards from the deck
            hand.add(deckObject.getCard());
        }
    }

    public boolean sameSuit(){
        boolean suitTester = true;
        if(hand.get(0).getSuit() == hand.get(1).getSuit() || hand.get(1).getSuit() == hand.get(2).getSuit() || hand.get(2).getSuit() == hand.get(3).getSuit() || hand.get(3).getSuit() == hand.get(4).getSuit()){
            return suitTester; //this if statement checks if each suit of each card of the hand equals the suit of the next cars
        }
        else{
            suitTester = false;
            return suitTester;
        }
    }

    public int onePair(){
        int rankPair = 0;
        int count = 0;
        for(int i = 0; i<4; i++){ //this goes through 4 of cards of the hand, since it checks each card against the next once
            if(hand.get(i).getRank() == hand.get(i+1).getRank()){ //this checks the rank of each card and compares it to the one after it
                count = count+1; //this counts how many times the ranks are equal
                rankPair = hand.get(i).getRank(); //this sets the rankPair equal to the rank of the card's that have the same pair
            }
        }
        if(count == 1){ //this checks if there's only one pair, and then returns the rank value if there is
            return rankPair;
        }else{ //this returns -1. as there is either more than one pair or no pairs
            rankPair = -1;
            return rankPair;
        }
    }
}
