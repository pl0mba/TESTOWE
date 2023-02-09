public class Monster {
    static int hp;
    static int mana;
    static int stam;
    static int dmg;

    static double eXPtoGive;

    //not in need to expand the Chrt class because all bosses have different hp, mana, stam.

    public Monster(int lvlMax4){
        if(lvlMax4==1){
            int scale = ((int) Math.random())*5;
            this.hp = 20*scale;
            mana = 30*scale;
            stam = 60*scale;
            dmg = scale;
            eXPtoGive = 0.5;
        }
        if(lvlMax4==2){
            hp=60;
            mana=180;
            stam=140;
            eXPtoGive=2;
            dmg=12;
        }
        if(lvlMax4==3){
            hp=90;
            mana=210;
            stam=180;
            eXPtoGive=3;
            dmg=18;
        }
        if(lvlMax4==4){
            hp=130;
            mana=250;
            stam=220;
            eXPtoGive=5;
            dmg=25;
        }
    }
    static void getAttacked(String dmgtype){
        if(dmgtype.equals("magic")) {
            Monster.stam -= 75;
            Monster.hp -= 40;
        }
        else
            Monster.hp-=30;
    }
}
