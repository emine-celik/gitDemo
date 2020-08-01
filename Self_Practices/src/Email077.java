import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Email077 {
    public static void main(String[] args) {
        /*
Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com

         */

        String email="craig_federighi@apple.com";

        String firstName=email.substring(0,email.indexOf('_')) ;
        String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));

        String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
        String topLevelDomain = email.substring(email.indexOf('.')+1);



        String ch=""+firstName.charAt(0);
        ch=ch.toUpperCase();

        firstName=firstName.replaceFirst(firstName.charAt(0)+"", "");
        System.out.println("First name: "+ch+firstName );


        String ch1=""+lastName.charAt(0);
        ch1=ch1.toUpperCase();

        lastName=lastName.replaceFirst(lastName.charAt(0)+"", "");
        System.out.println("Last name: "+ch1+lastName);



        System.out.println("Domain: "+domain );
        System.out.println("Top-Level Domain: "+topLevelDomain);








    }
}
