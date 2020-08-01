public class emailName {
    public static void main(String[] args) {
       /*
       In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

        */

      String email="mike_tyson@gmail.com";
      //            01234567890123456789





        if(email.contains("_")){
            String firstNAme = email.substring(0,email.indexOf('_'));

            String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@') );

            System.out.println(lastName+"_"+firstNAme+"@gmail.com");
        }else{
            System.out.println(email);
        }






    }
}
