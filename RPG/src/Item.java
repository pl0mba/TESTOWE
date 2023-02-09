import java.util.Scanner;

public class Item {
    static String use;
    public Item(String use, Chrt name){
        switch (use) {
            case "HP":
                name.hp+=50;
                break;
            case "MANA":
                name.mana+=50;
                break;
            case "STAM":
                name.stam+=70;
                break;
            case "MEGA BOOST" :
                name.hp+=25;
                name.mana+=40;
                name.stam+=100;
        }
        if(use.equals("DMG")){
            System.out.println("Insert the type of dmg you want to expand. to chose:\n Magic, Psychical");
            Scanner dmgtype = new Scanner(System.in);
            String type = dmgtype.next();
            switch (type){
                case "Magic":
                    name.magicPower +=10;
                    break;
                case "Psychical" :
                    name.psychPower +=9;
                    break;
            }
          //  dmgtype.close();
        }
    }
}