import edu.duke.*;
import java.util.*;
import java.lang.*;
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    //Write a method isVowel that has one char parameter named ch. 
    /**
     * Method isVowel
     *
     * @param ch A parameter
     * @return The return value
     */
    private String phrase;
    private char ch;
    public boolean isVowel(char ch){
        boolean value;
        HashSet <Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        if(vowels.contains(ch)){
            value = true;
        }
        else{
            value = false;
        }
        return value;
    }

    public String replaceVowels(String phrase, char ch){

        //StringBuilder str = new StringBuilder();
        phrase = "hahaha"; 
        // for(int i = 0; i< phrase.length(); i++){
        //boolean value2 = isVowel(str.charAt(i));
        // if(value2 == true){
        //   str.setCharAt(i,ch);

        //}
        // }  

        //String newPhrase = str.toString();

        return phrase;
    }
}
