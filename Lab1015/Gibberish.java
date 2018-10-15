
/**
 *Veronica Pratt
 */
public class Gibberish
{
    String sourceString; //declaration of the sourceString
    public Gibberish(){
        Template template = new Template();
        sourceString = template.getSourceString(); //initialization of the sourceString 
    }

    public String makeGibberish(WordList5000 wordList5000){
        int currentSourceIndex = 0; //this creates a starting point for the method to scan through the source string
        String resultString = ""; //this creates a place for the result string
        while(currentSourceIndex<sourceString.length()){
            int otherIndex = currentSourceIndex; //this creates a number equal to the currentSourceIndex from the last while-loop round
            currentSourceIndex = sourceString.indexOf("<", currentSourceIndex); //this updates the currentSourceIndex to the next value of < that is after where the last currentSourceIndex existed in the string
            if(currentSourceIndex < 0){ //this if checks to see if there are anymore of "<" in the code, if not, then it finishes the while loop and the method
                resultString += sourceString.substring(otherIndex);
                currentSourceIndex = sourceString.length();
            }else{ //ths is what you do if there is another "<" in the source string
                resultString += sourceString.substring(otherIndex, currentSourceIndex); //this adds to the result string the word from the past currentSourceIndex to the new one
                String placeHolderString = sourceString.substring(currentSourceIndex+1, sourceString.indexOf(">", currentSourceIndex)); //this creates a string from sourceString with a word reaching from the currentSourceIndex to following ">"
                int i = 1;
                while(i == 1){
                    String randomWord = wordList5000.getRandomWordString(placeHolderString); //this searches the SourceString for placeholderString to get a radnom word
                    if(randomWord != null){ //this is to make sure there is a random word to add to the resultString
                        resultString += " " + randomWord + " "; //this adds that random word to the resultString
                        i = 0;
                    }
                }
                currentSourceIndex = sourceString.indexOf("</>", currentSourceIndex) + "</>".length(); //this updates the currentSourceIndex to a new  number for the if statement, so eventually the program breaks out of the if statement
            }
        }
        return resultString; //this makes sure we can access the resultString we made
    }
}
