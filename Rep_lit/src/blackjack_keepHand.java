import java.util.Scanner;

public class blackjack_keepHand {
    public static void main(String[] args) {
/*
in blackjack after the player asks to keep the house 4 things may happen.

1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then thers a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.

check them using ifs to determine the result.

 */
        Scanner s=new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();

        if(player > 21){
            System.out.println("bust");
        }else if(house>player){
            System.out.println(" player loss");
        }else if(house == player){
            System.out.println(" its a tie");
        }else if(player > house){
            System.out.println("player wins");


        }











    }
}