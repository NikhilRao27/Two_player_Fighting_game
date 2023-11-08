public class player1 {

    private String name;
    public int health;
    private String weapon;

    public player1(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void AttackGun1(){
        this.health -= 20;
                if(this.health<=0){
                    System.out.println("The player is dead");
                }
    }

    public void AttackGun2(){
        this.health -= 30;
        if(this.health<=0){
            System.out.println("The player"+getName()+" is dead");
        }else {
        System.out.println("the health of the player is reduced , current health is "+this.health);
    }}
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
