package day10_IfElse;

public class practice {
    /*
    if(Condition1){
                A
        } else if(Condition2){
                B
        } else if(Condition3){
                C
        } else{
                D
                }

        A: Condition1 is true
        B: Condition1 is false and Condition2 is true
        C: Condition1 and Condition2 are false, and Condition3 is true
        D: if all previous conditions are false
       ONLY ONE OF THOSE BLOCK WILL GET EXECUTED (THE FIRST TRUE CONDITION)
grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F

     */
    public static void main(String[] args) {

        int score = 100;
        String grade = "";

        if(score >= 90 && score <= 100){
            grade = " You made A";
        }else if(score >=80 && score <= 89){
            grade = "You made B";
        }else if( score >= 70 && score <= 79){
            grade = "You made C";

        }else if(score >= 60 && score <= 69){
            grade = "You made D";
        }else{
            grade = "You made F";
        }

        System.out.println(grade);



    }




}
