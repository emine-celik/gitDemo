package day17;

public class String_Methods {
    public static void main(String[] args) {

        String str = "Cybertek";
        int a= str.length();
        char b =str.charAt(4);
        System.out.println( " "+a+ " "+b);

        String str1 = "Cybertek";
        int A1 = str.length()-1;
        System.out.println(A1);


      String str2= "    Cybertek       k ";// kelimenin arasinda kit bosluga dokunmaz
          str2 =str2.trim();
        System.out.println(str2);

        String str3="I love Java Language";

      //  str3 =  str3.substring(7, 10 +1); // bu sadece java yi output a yazar. yeni bir varaible ile butun cumleyi yazabirlisrz
        String word= str3.substring(7,10+1);
        System.out.println(str3);

        String word1=str3.substring(12);
        System.out.println(word1);

        //indexOf & LastIndexOf ==> int
        String str5="Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str5.indexOf("W");
        System.out.println(i1);
        System.out.println(str5.charAt(i1));

        int i2=str5.indexOf("We");
        System.out.println(i2);
        System.out.println(str5.charAt(i2));
        System.out.println("==================================");
        String str6="I love Java, have nice day";

        int i3=str6.indexOf("d");
        System.out.println(i3);
        System.out.println(str6.charAt(i3));

        String str7="Java Java Java";
        int i4=str7.lastIndexOf("J");
        int i5=str.indexOf("J");
        System.out.println(i4);

        int i7=str7.indexOf(" Java ")+1;
        int i6= str7.lastIndexOf("Java ");


        System.out.println(""+i6+" " +str7.charAt(i7));
        System.out.println(i7);

        // replace & replaceFirst
        String s1="I like Java, Java is a programming language";
        s1=s1.replace("Java", "C#");
        System.out.println(s1);

       String  s2="I like Java, Java is a programming language";
       s2=s2.replaceFirst("Java ", "C#");
        System.out.println(s2);





      String txt="foo bar";
        int p =txt.indexOf("b");
        int lastIndex=txt.length()-1;
        System.out.println(txt.charAt(p));



    }
}
