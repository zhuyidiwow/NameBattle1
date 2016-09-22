
/**
 * Created by HKLLC on 2016/9/20.
 */
public class Player {
    String name;
    int hp;

    public Player(String name){
        this.name = name;
        this.hp = 150;
    }


    public void print() {
        System.out.println(name + " is ready to battle. Current HP:"+ hp);
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
    }

}