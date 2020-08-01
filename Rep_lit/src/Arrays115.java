import java.util.Arrays;
import java.util.Scanner;

public class Arrays115 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      //  int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums = {2,5,7,0,1};
       // Arrays.sort(nums);
       // System.out.println(nums[nums.length-1]);

        int max=0;
        for(int i=0; i <= nums.length-1;i++){
          if(nums[i]>max){
             max=nums[i];
        }
            System.out.print(""+max);


        }













    }
}
