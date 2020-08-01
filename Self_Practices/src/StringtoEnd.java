public class StringtoEnd {
    public static void main(String[] args) {
     /*
     In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo
    */

     String txt="foo";




     txt=  txt.replaceFirst("" +txt.charAt(txt.length()-1), "");
        System.out.println(txt);

        System.out.println("=========================================");

        String txt1="TxtX tctxt ";

       // System.out.println(txt1.charAt(txt1.length()-1));
        System.out.println(txt1.indexOf("ct"));
        System.out.println(txt1.substring(0,txt1.length()-1 ));


    }
}
