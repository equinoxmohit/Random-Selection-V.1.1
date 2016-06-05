/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.randomselection;

import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let us play a game");
        System.out.println("The game is simple. You have to select random number 3 times and if u get number greater than me 2 times you will else I win.");
        System.out.println("The number will be inclosed as a,b, and c.");
        System.out.println("If u select anything except a,b,c you will be out of the game");
        System.out.println("IF you cant win a single game, you loose the game. You have to atleast win a game to either draw or win it.");
        System.out.println("So you want to play??[Y/N]");
            //first case: a:2,b:4,c:6
        //second case: a:6,b:2,c:4
        //third case: a:2,b:4,c:6

        if (scanner.next().equalsIgnoreCase("Y")) {
            while (true) {
                System.out.println("Select a,b,c");
                String random1 = scanner.next();
                if (random1.equalsIgnoreCase("a")) {
                    System.out.println("You selected 2");
                    System.out.println("I selected 4. I win the first one");
                    System.out.println("You may win the rest");
                } else if (random1.equalsIgnoreCase("b")) {
                    System.out.println("You selected 4.");
                    System.out.println("I also selected 4. It is a draw");
                } else if (random1.equalsIgnoreCase("c")) {
                    System.out.println("You selected 6.");
                    System.out.println("I selected 4. Congratulations. You win the first one");

                } else {
                    System.out.println("Select the correct number next time");
                    System.exit(0);
                }
                System.out.println("Again.Select a,b,c");
                String random2 = scanner.next();
                if (random2.equalsIgnoreCase("a")) {
                    System.out.println("You selected 6.");
                    System.out.println("I selected 2. Congratulations. You win the second one");

                } else if (random2.equalsIgnoreCase("b")) {
                    System.out.println("You selected 2.");
                    System.out.println("I also selected 2. It is a draw");
                } else if (random2.equalsIgnoreCase("c")) {
                    System.out.println("You selected 4.");
                    System.out.println("I  selected 2. You win the second one.");
                } else {
                    System.out.println("Select the correct number next time");
                    System.exit(0);
                }
                System.out.println("For the final time.Select a,b,c");
                String random3 = scanner.next();
                if (random3.equalsIgnoreCase("a")) {
                    System.out.println("You selected 2");
                    System.out.println("I selected 4. I win the  third");
                    
                } else if (random3.equalsIgnoreCase("b")) {
                    System.out.println("You selected 4.");
                    System.out.println("I also selected 4. It is a draw");
                } else if (random3.equalsIgnoreCase("c")) {
                    System.out.println("You selected 6.");
                    System.out.println("I selected 4. Congratulations. You win the third one");

                } else {
                    System.out.println("Select the correct number next time");
                    System.exit(0);
                }

                if ((random1.equalsIgnoreCase("c")) && ((random2.equalsIgnoreCase("a")) || (random2.equalsIgnoreCase("c"))) && (random3.equalsIgnoreCase("c")) || ((random1.equalsIgnoreCase("c")) && ((random2.equalsIgnoreCase("a")) || (random2.equalsIgnoreCase("c"))) || (((random2.equalsIgnoreCase("a")) || (random2.equalsIgnoreCase("c"))) && (random3.equalsIgnoreCase("c"))) || ((random1.equalsIgnoreCase("c")) && (random3.equalsIgnoreCase("c")))))
                {
                    System.out.println("CONGRATULATIONS..You Win The Game.");
                    System.out.println("As I promised. You get 2 free QFX tickets but you need to pay for it.");
                } else if (((random1.equalsIgnoreCase("b")) && (random2.equalsIgnoreCase("b")) && (random3.equalsIgnoreCase("b")))||((random1.equalsIgnoreCase("b")) && (random2.equalsIgnoreCase("b")))||((random2.equalsIgnoreCase("b")) && (random3.equalsIgnoreCase("b")))||(((random1.equalsIgnoreCase("b"))&&(random3.equalsIgnoreCase("b")))) || ((random1.equalsIgnoreCase("c"))&&(random2.equalsIgnoreCase("b"))&&(random3.equalsIgnoreCase("b"))) || ( (random1.equalsIgnoreCase("b")) && ((random2.equalsIgnoreCase("a")) || (random2.equalsIgnoreCase("c"))) && (random3.equalsIgnoreCase("b"))) || ((random1.equalsIgnoreCase("b")) && (random2.equalsIgnoreCase("b")) && (random3.equalsIgnoreCase("c"))) || ((random1.equalsIgnoreCase("c"))&&(random2.equalsIgnoreCase("b"))&&(random3.equalsIgnoreCase("a")))|| ( (random1.equalsIgnoreCase("a")) && ((random2.equalsIgnoreCase("a")) || (random2.equalsIgnoreCase("c"))) && (random3.equalsIgnoreCase("b"))) || ((random1.equalsIgnoreCase("b"))&&(random3.equalsIgnoreCase("c")))  ) {
                    System.out.println("The game is draw.");
                }
                
                else
                {
                    System.out.println("You loose the game.Better luck next time.");
                }
                System.out.println("Do you want to play again [Y/N]");
                if (scanner.next().equalsIgnoreCase("n")) {
                    System.exit(0);
                }
            }

        }
    }

}
