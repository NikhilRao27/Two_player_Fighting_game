public class Player2 extends player1{

    private boolean shield;
    //private int health;


    public Player2(String name, int health, String weapon, boolean shield) {
        super(name, health, weapon);
        this.shield = shield;
    }

    @Override
    public void AttackGun1() {

        if(shield){
            this.health -= 10;

        }else{
            this.health -= 15;
        }
        if(this.health<=0){
            System.out.println(getName()+"is dead");

        }
        else {
            System.out.println("health got deducted and current hlth is "+this.health);
        }


    }

    public void AttackGun2() {

        if(shield){
            this.health -= 20;

        }else{
            this.health -= 40;
        }
        if(this.health<=0){
            System.out.println(getName()+"is dead");

        }
        else {
            System.out.println("health got deducted and current hlth is "+this.health);
        }


    }

    public boolean isShield() {
        return shield;
    }

    public boolean getShield() {
        return shield;
    }
}
