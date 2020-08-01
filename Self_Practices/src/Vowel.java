import java.util.Scanner;

public class Vowel {
    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for(int i=0;i<=word.length()-1; i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'|| word.charAt(i) =='u'  ){
                System.out.print(word.charAt(i));
            }
        }














    }
}
