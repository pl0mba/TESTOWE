import java.util.Scanner;

public class EasyGame {
    public EasyGame(Chrt player1, Chrt player2) {
        Monster easy1 = new Monster(1);

        Monster second = new Monster(1);

        Monster third = new Monster(1);

        Monster kubaRozpruwacz = new Monster(2);

        Battle firstround = new Battle(easy1,player1,player2);
        if(player1.isAlive(player1)!=true || player2.isAlive(player2)!=true) {
            if (player1.isAlive(player1) != true) {
                Battle secondround = new Battle(second, player2);
            } else {
                Battle secondround = new Battle(second, player1);
            }
        }
        else {
            Battle secondround = new Battle(second, player1,player2);
        }
        Battle thirdBattle = new Battle(third, player1);



    }
}
