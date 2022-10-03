import java.lang.*;

import edu.duke.*;

public class WordLengths {

     

    public void countWordLengths() {

      

        FileResource Resource = new FileResource();

        int [] counts = new int[31];

        String [] lwords = new String[31];

       

        for (String word : Resource.words()){

           

            int Wordlength = word.length();

            for (int i=0; i<word.length();i++){

                char currChar = word.charAt(i);

                if ((i==0) || (i==word.length()-1)){

                    if (!Character.isLetter(currChar)) Wordlength--;

                }

            } 

            counts[Wordlength]++;  

            //System.out.println("Word length of " + word + " is " + Wordlength + " and count is " + counts[Wordlength]);

            if (lwords[Wordlength]!= null) {
                //lwords[Wordlength] =+  word ; }
                lwords[Wordlength] = lwords[Wordlength] + " " + word;}

                else {lwords[Wordlength] = word;}

                   

            //System.out.println("Word length of " + word + " is " + Wordlength + ". counts[" + Wordlength + "] is " + counts[Wordlength] + ". lwords[" + Wordlength + "] is " + lwords[Wordlength]);

        }

       

        for (int i = 0; i<counts.length;i++)

            if (counts[i]>0) {

                System.out.println("There are " + counts[i] + " words of length " + i + " and they are: " + lwords[i]);

            }

        // indexOfMax(counts);     

        }

  

 

    public void indexOfMax(int[] values) {

   

            int max = 0;

            int position = 0;

                for (int i = 0; i <values.length;i++)

                    { System.out.println("The current word for i = : " + i + " is " + values[i] + " at position " + position);

                      if (values[i] > max)

                        {

                            max = values[i];

                            position = i;

                        }

            }

           

          System.out.println("The most common word is :"+ position);

            

        }

          

    }  
           
