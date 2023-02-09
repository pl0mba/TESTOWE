import java.util.ArrayList;
import java.util.Scanner;

public class Chrt {
    static int hp = 0;
    static int mana = 0;
    static int stam = 0;
    static int psychPower = 5;
    static int magicPower = 3;

    static double exp = 0;
    public static ArrayList<Chrt> allies = new ArrayList<Chrt>();
    public static void goodsdepartment(Chrt baby){
        allies.add(baby);
    }

    public Chrt() {
        System.out.println("Type your character clas. To chose:\n Warrior, Mage, Tank. (Please check the spelling and uppercase letters)");
        Scanner scan = new Scanner(System.in);
        String clas = scan.next();
        if (clas.equals("Warrior")) {
            hp = 150;
            mana = 100;
            stam = 300;

        }
        if (clas.equals("Mage")) {
            hp = 100;
            mana = 300;
            stam = 150;
        }
        if (clas.equals("Tank")) {
            hp = 250;
            mana = 100;
            stam = 200;
        }

        Atributes gis = new Atributes();

        if (exp >= 5) {
            System.out.println("Choose bost:\n Magicdmg, psychdmg, armor, healing");
            Scanner scan = new Scanner(System.in);
            String type = scan.next();
            switch (type){
                case "Magicdmg":
                    gis.magicPower+=5;
                    break;
                case "psychdmg":
                    gis.psychPower+=5;
                    break;
                case "armor":
                    gis.armor+=5;
                    break;
                case "healing":
                    gis.healing+=5;
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
     /*   int armor = Atributes.getArmor();
        int psyPower = Atributes.getPsychPower()+psychPower;
        int mgicPower = Atributes.getMagicPower()+magicPower;
        int healing = Atributes.getHealing();

      */
        }
    }


   /* public static int atrib(Chrt name, String type){
        int hello = switch (type){
            case "armor":
                hello = Atributes.getArmor();
                break;
            case "magicPower":
                hello = Atributes.getMagicPower();
                break;
            case "psychicalPower":
                hello = Atributes.getPsychPower();
                break;
            case "healing":
                hello = Atributes.getHealing();
                break;
        }
    }*/

    public static int getHp(Chrt name) {
      //  System.out.println("your hp" + name.hp);
        return hp+Atributes.getArmor();
    }

    public static int getMana(Chrt name) {
        System.out.println("your mana" + name.mana);
        return mana;
    }

    public static int getStam(Chrt name) {
        System.out.println("your stam" + name.stam);
        return stam;
    }

    public static int getMagicPower(Chrt name) {
        return magicPower+Atributes.getMagicPower();
    }

    public static int getPsychPower(Chrt name) {
        return psychPower+Atributes.getPsychPower();
    }
    public static int getArmor(Chrt name){
        return Atributes.getArmor();
    }

    static void getAttacked(String dmgtype){
        if(dmgtype.equals("magic")) {
            Chrt.stam -= 75;
            Chrt.hp -= 40;
        }
        else
            Chrt.hp-=30;
    }

    public void Help(Chrt name){
        if(allies.contains(name)) {
            if (allies.isEmpty()){
                System.out.print("There are no allies left");
            }
            else {

                System.out.println("Ally is coming");
            }
        }
    }
    public static boolean isAlive(Chrt name) {
        if (Chrt.hp > 0)
            return true;
        return false;
    }

}
