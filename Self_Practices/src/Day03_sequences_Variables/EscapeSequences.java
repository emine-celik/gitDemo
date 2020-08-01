package Day03_sequences_Variables;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello everyone \nMy name is Emine"); // \n (newline)
                                            // \n Description:appends  a newline to printing message
        System.out.println("================================");

        System.out.println("\tI am in Milwaukee\n "); // \t Horizontal Tab
                                            // \t Description: appends paragraph space
        // System.out.println("\t\t\t\n\n I love programming "); YOU HAVE TO PUT HORIZONTAL TAB RIGHT BEFORE THE MESSAGE
        System.out.println("\n\n\t\t\tI love programing");

        System.out.println("===========================");

        System.out.println("\\"); // backslash :  if you want to put 1 backslash you need to put 2 backslash
        System.out.println("\\\\"); // this prints me 2 back slash

        System.out.println(" /"); // this print me 1 front slash
        System.out.println("//"); // this print me 2 front slash

    }
}
