import java.util.Scanner;

public class Atributes {
    static int magicPower;
    static int psychPower;
    static int armor;
    static int healing;
    public Atributes(){
        Scanner whatAtbts = new Scanner(System.in);
        System.out.println("Choose from atributes: 1.magicPower, 2.psychicalPower, 3.armor, 4.healing\n" +
                        "type from left to right how much bonus to each attribute(sum lower/equal to 15)");
        magicPower=whatAtbts.nextInt();
        psychPower=whatAtbts.nextInt();
        armor=whatAtbts.nextInt();
        healing=whatAtbts.nextInt();
      //  whatAtbts.close();

    }

    public static int getArmor() {
        return armor;
    }

    public static int getHealing() {
        return healing;
    }

    public static int getMagicPower() {
        return magicPower;
    }

    public static int getPsychPower() {
        return psychPower;
    }
}
