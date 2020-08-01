package Day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 25;
        int b = 60;
         String c="";
        if(a>b){
         c= (a+" is the max number");
            System.out.println(c);
        }
        if(b>a){
            c=(b+ " is the max number");
            System.out.println(c);
        }
        if(a==b){
            c=("Both are equal");
            System.out.println(c);
        }



    }
}
