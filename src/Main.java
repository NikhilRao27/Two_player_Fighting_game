import java.util.Random;

public class Main {
    public static void main(String[] args) {

       Random rand = new Random();

        player1 p1 = new player1(" nik", 100, "weapon");
        boolean shield = rand.nextBoolean();
        Player2 p2 = new Player2(" hil", 100, "weapon",shield );

       while (true) {


           boolean l = rand.nextBoolean();
           System.out.println("random generated" + l);



           if (l) {
               String p1_attack = "G1";
               String p2_attack = "G2";

               p1.AttackGun1();
               p2.AttackGun2();

           } else {
               String p1_attack = "G2";
               String p2_attack = "G1";

               p1.AttackGun2();
               p2.AttackGun1();

           }

           if(p1.health<=0 && p1.health<p2.health){
               System.out.println(p1.getName()+"lost the game");
               break;

           } else if (p2.health<=0 && p2.health<p1.health) {
               System.out.println(p2.getName()+"lost the game");
               break;

           }




       }
        //System.out.println("Hello world!");



}}