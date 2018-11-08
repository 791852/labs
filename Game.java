
/**
 * Write a description of class GameClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
        public Game(){
            Deck deckObject = new Deck(); //creates a new deck object
            HandClass handObject = new HandClass(deckObject); //creates a new hand object
        }
}