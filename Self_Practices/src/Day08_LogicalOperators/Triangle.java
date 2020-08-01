package Day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 120;
        int angle3 = 20;
        int sum = angle1 +angle2 +angle3;
        String result="";
        if(sum==180){
            result =(sum+ " VALID");
        }
        if(sum!= 180){
            result =(sum+ " INVALID ");
            System.out.println(result);
        }
        System.out.println("=================================================");
        int num = 31;

        if(num % 2 == 0){
            System.out.println(num+" is even number");
        }
        if(num % 2 != 0){
            System.out.println(num+ " is odd number");
        }


    }
}
