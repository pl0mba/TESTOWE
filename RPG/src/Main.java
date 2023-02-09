
import java.util.Objects;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
     //   Charlist people = new Charlist("Leszy");

      //  Chrt anotherOne = new Chrt();
        Chrt ania = new Chrt();
        Chrt pudzian = new Chrt();

        pudzian.getPsychPower(pudzian);
        ania.getPsychPower(ania);


        new Item("MEGA BOOST", ania);
        new Item("DMG", pudzian);

        pudzian.getPsychPower(pudzian);
        ania.getPsychPower(ania);

        // Chrt player1 = pudzian;
        // Chrt player2 = ania;

        EasyGame firstPlay = new EasyGame(pudzian,ania);

      /*  Chrt[] charac = new Chrt[10];
        for(int i=0; i<charac; i++){

        }*\
        Monster[] bosses = new Monster[5];

      /*  Objects[][] allChars = new Objects[2][15];
        for(int i=0; i<charac.length; i++)
            allChars[0][i]=charac[i];
        for(int i=charac.length-1; i<bosses.length; i++)
            allChars[1][i]=bosses[i]; */
        Chrt.goodsdepartment(pudzian);
        Chrt.goodsdepartment(ania);




    }

 //   public void addChar(String name, String clas, int team) {
    //    Character newborn = new Character();
 //   }

 //   public void addChartoList(Character name, Character head){
 //       Character name = new Character();
   //     name = Character(head, name);
  //  }

 /*   public boolean empty(Charlist head) {
        return (head == null);
    } */
}
