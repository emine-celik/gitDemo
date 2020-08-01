package day20_LOOP;

public class Task6 {
    public static void main(String[] args) {

        for (int i =1; i < 2; i += 1)

            if (i % 3 == 0 && i% 2!=0) {

            }else{
                System.out.print("Do not printed");

                System.out.print(i + " ");

            }
        System.out.println();

        for(char i='A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        int sum=0;
        for(int i=1;i<=100;i++){

            if(i % 2== 0){
                sum+=i;

            }

        }
        System.out.print(sum+ " ");






    }
}