import java.util.Random;
import java.util.Scanner;
import Skills.*;

/**
 * Created by HKLLC on 2016/9/20.
 */
public class Battle {
    String player1;
    String player2;
    Skills s[] = new Skills[] {new Maimeng(),new Shouting(),new Watergun(),new Bite(),new Fireball(),new Music(),new Academic(),new Angerofolddriver(),new CuiLaJiTuiBao(),new Honghuangpower()};





    public void attack (Player p1, Player p2, String target, Skills skill){
        if (target == p1.name) {
            if (skill.getDamage() > 0){
                p1.receiveDamage(skill.getDamage());
                System.out.println(p2.name + " use " + skill.getName() + ". --- " + p1.name +"'s HP: " + p1.hp);
            }
            else{
                p2.receiveDamage(skill.getDamage());
                System.out.println(p2.name + " use " + skill.getName() + ". HP has recovered. --- " + p2.name +"'s HP: " + p2.hp);
            }

        }
        else {
            if (skill.getDamage() > 0){
                p2.receiveDamage(skill.getDamage());
                System.out.println(p1.name + " use " + skill.getName() + ". --- " + p2.name +"'s HP: " + p2.hp);
            }
            else{
                p1.receiveDamage(skill.getDamage());
                System.out.println(p1.name + " use " + skill.getName() + ". HP has recovered. --- " + p1.name +"'s HP: " + p1.hp);
            }
        }
    }

    public void battle(Player p1, Player p2, Skills[] s){
        while(p1.hp>=0 && p2.hp>=0){
            int rand = new Random().nextInt(10);
            if (rand >6) rand = new Random().nextInt(10);
            //P1
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            attack(p1,p2,p2.name,s[rand]);
            if (p2.hp <= 0) {
                System.out.println(p1.name + " is the winner!!");
                break;
            }
            rand = new Random().nextInt(10);
            if (rand >6) rand = new Random().nextInt(10);

            //P2
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            attack(p1,p2,p1.name,s[rand]);
            if (p1.hp <= 0) {
                System.out.println(p2.name + " is the winner!!");
                break;
            }

        }
    }

}
