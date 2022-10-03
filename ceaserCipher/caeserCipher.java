import edu.duke.*;
import java.util.*;
/**
 * Write a description of ceaserCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caeserCipher {
public String encrypt(String input, int key) {
    //Make a StringBuilder with message (encrypted)
    StringBuilder encrypted = new StringBuilder(input);
    //Write down the alphabet
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //Compute the shifted alphabet
    String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
    //Count from 0 to < length of encrypted, (call it i)
    for (int i = 0; i < encrypted.length(); i++){
        //Look at the ith character of encrypted (call it currChar)
        char currChar = encrypted.charAt(i);
        //Find the index of currChar in the alphabet (call it idx)
        int idx = alphabet.indexOf(currChar);
        //If currChar is in the alphabet
        if (idx != -1){   
            //get the idxth character of shiftedAlphabet (newChar)
            char newChar = shiftedAlphabet.charAt(idx);
            //Replace the ith character of encrypted with newChar
            encrypted.setCharAt(i, newChar);
        }
        //Otherwise: do nothing
    }        
    //Your answer is the string inside of encrypted
    return encrypted.toString();
}

public void testCaesar() {
    //Scanner keyboard = new Scanner(System.in);
    //System.out.print("Enter key: ");
    //int key = keyboard.nextInt();
    //System.out.println(key);
    int key = 15;
    FileResource fr = new FileResource();
    String message = fr.asString();
    message = message.toUpperCase();
    String encrypted = encrypt(message, key);
    System.out.println(encrypted);
    String decrypted = encrypt(encrypted, 26-key);
    String password = "PASS";
    System.out.print("Enter Password: ");
    Scanner keyboard = new Scanner(System.in);
    keyboard.next(password);
    System.out.println(decrypted);

}
public static void main(String[] args){
    caeserCipher code = new caeserCipher();
    Scanner keyboard = new Scanner(System.in);
    code.encrypt("Hello how are you" , (int)(Math.random()));
    code.testCaesar();
}
}


