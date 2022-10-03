import edu.duke.*;
import java.util.*;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

/**
 * Write a description of wordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WordPlay {
  public static boolean isVowel(char ch) {
     ArrayList <Character> vow = new ArrayList();
     vow.add('a');
     vow.add('e');
     vow.add('i');
     vow.add('o');
     vow.add('u');
     vow.add('A');
     vow.add('E');
     vow.add('I');
     vow.add('O');
     vow.add('U');
    for(int i = 0; i<vow.size(); i++){
        if(vow.get(i)==(ch)){
            return true;
        }
    }
    
    return false;
  }
  
  public static String replaceVowels(String phrase, char ch){
      StringBuilder replaceVow = new StringBuilder(phrase);
      StringBuilder newVow = new StringBuilder();
      for(int i = 0; i<phrase.length(); i++){
          
          //phrase.charAt(i);
          if((isVowel(replaceVow.charAt(i))) == false){
            newVow.append(replaceVow.charAt(i));
           }
            
         else{
              newVow.append(ch);
            }
    }
    String replaceVowels = newVow.toString();
    return replaceVowels;
}

public static String emphasize(String phrase, char ch){
       // String lowPhrase = phrase.toLowerCase();
        char upperCh = Character.toUpperCase(ch);
        StringBuilder replaceLoc = new StringBuilder(phrase);
        StringBuilder newLoc = new StringBuilder();
       for(int i = 0; i<phrase.length(); i++){
           if(replaceLoc.charAt(i) ==  ch || replaceLoc.charAt(i) == upperCh){
                if(i % 2 == 1){
                   replaceLoc.setCharAt(i,'+');
            }
            else{
                replaceLoc.setCharAt(i,'*');
            }
        }
            }
        String finalLoc = replaceLoc.toString();
        return finalLoc;
        }


public static void main(String[] args) throws IOException{
    WordPlay vow = new WordPlay();
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
    char ch = (char)obj.read();  
    System.out.println(vow.isVowel(ch));
}
}

