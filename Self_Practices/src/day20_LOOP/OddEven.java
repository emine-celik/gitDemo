package day20_LOOP;

public class OddEven {
    public static void main(String[] args) {

        // i: 1, 3,5,7....99
        for(int i=1; i<=99; i +=2 ) {  // ODD NUMBER
            if(i%3==0 && i%5==0)
            System.out.print(i + " ");
        }
        // i:0,2,4,6,8,....100 EVEN NUMBER
        System.out.println();
        System.out.println("==========================================");
        for(int i=0;i<=100; i+=2 ){
            if(i%3==0 && i%5==0)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("============================================");

        int sumOfEven=0;
        for(int i = 0; i<=100; i++){
            sumOfEven += i;
        }
        System.out.print(sumOfEven+" ");

        System.out.println();
        System.out.println("===============================================");

       /*
         for(int i=1; i <=99; i+=2){ matematic way
         sumOfOdd +=i;
         */
        int sumOfOdd = 0;

        for(int i = 0; i <= 100; i++){  // java way
           if(i%2 != 0){
              // sumOfOdd = sumOfOdd + i;
               sumOfOdd +=i;
           }

        }


        System.out.print(sumOfOdd+" ");














    }
}
