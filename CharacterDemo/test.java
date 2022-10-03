
/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test {
// 01234567890123456789012345
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// RSTUVWXYZABCDEFGHIJKLMNOPQ
//  ^       ^   ^
static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
static String Cipher = "";
static StringBuilder str = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
String messageToEncrypt = "";



    public void setCipher(int key, String messageToEncrypt){
        String ach = str.substring(key);
        String pch = str.substring(0, key);
        
        
        StringBuilder enc = new StringBuilder(ach + pch);
        StringBuilder mes = new StringBuilder(messageToEncrypt);
       
            
            //returns the character that is present at the given index
            //char cod = enc.charAt(k);
            //returns the letter from enc and sets mes to encryption
            int whatev = enc.indexOf(mes);
            for(i = 0; i < messageToEncrypt.length(); i++){
            mes.setCharAt(i, enc.charAt(i));
        }
        System.out.println(mes);
        
        
   
}
