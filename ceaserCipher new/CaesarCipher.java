import edu.duke.*;
import java.util.*;
import java.lang.*;
public class CaesarCipher {
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowAlphabet = alphabet.toLowerCase();
        //lowAlphabet.equalsIgnoreCase(alphabet);
        //Compute the shifted alphabet
       String shiftedAlphabet;
        //alphabet.substring(0,key);
        int idx;
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            if(Character.isUpperCase(currChar)){
        idx = alphabet.indexOf(currChar);
        shiftedAlphabet = alphabet.substring(key)+
        alphabet.substring(0,key);
        }
        else{
        idx = lowAlphabet.indexOf(currChar);
        shiftedAlphabet = lowAlphabet.substring(key)+
        lowAlphabet.substring(0,key);
        }
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        System.out.println(encrypted.toString());
        return encrypted.toString();
    }
  
     public String encryptTwoKeys(String input, int key1, int key2){
         String encrypted = "";
         ArrayList<String> list = new ArrayList<String>();
         int key;
        
       //  char ch = input.toCharArray();
         StringBuilder sb = new StringBuilder(input);
        for(int i = 0; i < input.length(); i++){          
                // odd key one 
                
                // even key 2
                
                if ((i % 2) != 0 ){
                    key = key2;
                }
                else{
                    key = key1;
                }
                System.out.println("sb.charAt(i) is  " +  sb.charAt(i));
                //sb.charAt(i);
                //System.out.println(en(ch[i],key));
                System.out.println("key is " + key);
                String temp = Character.toString(sb.charAt(i));
                System.out.println("temp is " + temp);
                sb.append(encrypt(Character.toString(sb.charAt(i)), key));
           
              
             
        }
        String sbString = sb.substring(input.length());
        System.out.println("sbString is " + sbString);

        return sbString;
    }
    public void testCaesar() {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
    }
}

