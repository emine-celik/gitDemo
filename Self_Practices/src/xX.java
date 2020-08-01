public class xX {
    public static void main(String[] args) {
/*
Given a string word, if the first or
 last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
  otherwise print the string unchanged.
 */
        String word= "Hi";

       if(word.charAt(0) == 'x' || word.charAt(0)== 'X' ){
          word= word.replaceFirst(""+word.charAt(0),"" );

       }

       if(word.charAt(word.length()-1)== 'X' || word.charAt(word.length()-1) == 'x'){
           word=word.replaceFirst(""+word.charAt(word.length()-1), "");

       }


        System.out.println(word);



    }
}
