
/**
 * Write a description of class SentenceBuilderRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SentenceBuilderRunner
{
    String [] nouns = {"dog", "cat", "boy", "girl", "book", "box", "fox", "tree", "kite", "cloud"};
    String [] verbs = {"jumps", "runs", "looks", "flies", "walks", "makes", "skips", "floats", "plays", "sings" };
    String [] adjectives = {"funny", "happy", "lucky", "smart", "kind", "helpful", "tall", "short", "grand", "lovely"};
    String [] determiners = {"the", "my", "your", "his", "her", "our", "their", "Jack's", "Jill's","John's"};
    String [] adverbs= {"quickly", "briskly", "accidentally", "almost", "always", "cautiously", "cheerfully","knowingly", "sometimes", "stealthily"};
    String [] prepositions = {"over", "near", "to", "from", "through", "behind", "inside of", "under", "around", "toward"};
public SentenceBuilderRunner(){
    
}
public String getSentence(){
    String sentence = getNounPhrase() + getVerbPhrase() + getPrepositionalPhrase();
    return sentence;
}
public String getNounPhrase(){
    return getRandomDeterminer() + " " + getRandomAdjective() +" " + getRandomNoun() + " ";
}
public String getVerbPhrase(){
    return getRandomAdverb() + " " + getRandomVerb() + " ";
}
public String getPrepositionalPhrase(){
    return getRandomPreposition () + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun();
}
public String getRandomNoun(){
    return nouns[(int)(Math.random()*nouns.length)];
}
public String getRandomVerb(){
    return verbs[(int)(Math.random()*nouns.length)];
}
public String getRandomAdjective(){
    return adjectives[(int)(Math.random()*nouns.length)];
}
public String getRandomAdverb(){
    return adverbs[(int)(Math.random()*nouns.length)];
}
public String getRandomDeterminer(){
    return determiners[(int)(Math.random()*nouns.length)];
}
public String getRandomPreposition(){
    return prepositions[(int)(Math.random()*nouns.length)];
}
public void loadSentences(){
    System.out.println(getSentence());
}
}
