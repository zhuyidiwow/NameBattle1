import Skills.Fireball;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by HKLLC on 2016/9/20.
 */
public class Main {
    public static void main (String[] args) {
        Battle myB = new Battle();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        System.out.println("The name of the 1st player:");
        Scanner scanner = new Scanner(System.in);
        player1.name = scanner.nextLine();
        player1.print();

        System.out.println("The name of the 2nd player:");
        scanner = new Scanner(System.in);
        player2.name = scanner.nextLine();
        player2.print();

        System.out.println("\n ---------- " + player1.name + " vs " + player2.name + " ----------\n");

        int rand = new Random().nextInt(2);
        if (rand == 0){
            System.out.println(player1.name + " acts more quickly to attack first.\n");
            myB.battle(player1, player2, myB.s);
        }
        else{
            System.out.println(player2.name + " has a better face to attack first.\n");
            myB.battle(player2, player1, myB.s);
        }


    }
}
