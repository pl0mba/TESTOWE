import java.util.Scanner;

public class Battle {
    public Battle(Monster monster, Chrt player1, Chrt player2){
        while(monster.hp>0 && (player1.isAlive(player1) || player2.isAlive(player2))){
            System.out.println("Chose type of Attack for first character:\n Psychical, Magical");
            Scanner scan = new Scanner(System.in);
            String type1 = scan.next();
            System.out.println("Chose type of Attack for second character:\n Psychical, Magical");
            String type2 = scan.next();

            if(type1.equals("Psychical"))
                monster.hp-=player1.getPsychPower(player1);
            else
                monster.hp-=player1.getMagicPower(player1);
            if(type2.equals("Psychical"))
                monster.hp-=player2.getPsychPower(player2);
            else
                monster.hp-=player2.getMagicPower(player2);
            if(monster.hp>0) {
                if (player1.getArmor(player1) > 0) {
                    Atributes.armor -= monster.dmg;
                }
                else{
                    player1.hp-=monster.dmg;
                }
            }
            if(monster.hp>0) {
                if (player2.getArmor(player2) > 0)
                    Atributes.armor -= monster.dmg;
                else player2.hp-=monster.dmg;
            }
        }
        if(player1.isAlive(player1))
            System.out.println();
        else
            System.out.println("Your companys dead");
        if(player2.isAlive(player2))
            System.out.println();
        else System.out.println("Your companys dead");
        if(monster.hp<=0)
        System.out.println("monster down! Good job. Keep that streak.");
    }
    public Battle(Monster monster, Chrt player1){
        while(monster.hp>0 && player1.isAlive(player1)){
            System.out.println("Chose type of Attack for first character:\n Psychical, Magical");
            Scanner scan = new Scanner(System.in);
            String type1 = scan.next();

            if(type1.equals("Psychical"))
                monster.hp-=player1.getPsychPower(player1);
            else
                monster.hp-=player1.getMagicPower(player1);

            if(monster.hp>0) {
                if (player1.getArmor(player1) > 0) {
                    Atributes.armor -= monster.dmg;
                }
                else{
                    player1.hp-=monster.dmg;
                }
            }
        }
        System.out.println("First monster down! Good job. Keep that streak.");
    }
}
