package day01_Variables.Rplit054;

import java.util.Scanner;

/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
public class Replit073_MiddleThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word = scan.next();
        int word1=word.length();

        if(word1 % 2 == 0 || word1 < 5 ){
            System.out.println("invalid");
        }else{
            int middThree= word1 /2;
            System.out.println(word.substring(middThree -1 ,middThree +2));
        }




        String word2=scan.next();
        String word3=scan.next();

        word2.length();
        word3.length();

      if(word2.length()> word3.length() ) {
          System.out.println(word2);
      }else if(word2.length()> word3.length())
          System.out.println(word3);

}




    }

