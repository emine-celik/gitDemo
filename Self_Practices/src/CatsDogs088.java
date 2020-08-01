import java.util.Scanner;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */
public class CatsDogs088 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word ="dog";


        while(word.contains("cat")){
            countOfCats++;
            word=word.replaceFirst("cat", "");
        }
       while (word.contains("dog")){
           countOfDogs++;
           word=word.replaceFirst("dog", "");
       }

       /* if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
*/


        System.out.println(countOfCats==countOfDogs);










    }
}
