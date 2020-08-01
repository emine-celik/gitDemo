package day10_IfElse;

public class task01 {
    /*
    write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 150 or less than 0 ==> invalid entry

     */
    public static void main(String[] args) {
        int age = 39;
        String group = "";
        if(age < 3){
            group = "baby";
        }else if(age>3 && age < 5){
            group = "Toddler";
        }else if( age > 6 && age<9){
            group = "Kid";
        }else if(age > 10 && age < 12){
            group = "Pre-Teen";
        }else if(age > 13 && age <17) {
            group = "Teenager";
        }else if(age >18 && age <20) {
            group = "Young Adult";
        }else if(age > 21 && age< 39){
            group = " Adult";
        }else if(age> 40 && age <49 ){
            group = "Young Middle-Aged Adult";
        }else{
            group = "invalid entry";
        }
        System.out.println(group);




    }
}
