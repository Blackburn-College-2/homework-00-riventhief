/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW0_CS212;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jason.hufford
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = 3;
        int secretnum = rand.nextInt(x);
//System.out.println(secretnum);
        int shrimpguess = 0;
        int tacosguess = 0;
        int sushiguess = 0;
        int loop = 0;
        Scanner yee = new Scanner(System.in);
        String guess;
        String[] meals = {"shrimp", "tacos", "sushi"};
        String secret = meals[secretnum];
        //System.out.println(secret);
        System.out.println("The secret meal must be one of the following");
        for (int i = 0; i < 3; i++) {
            System.out.println(meals[i]);
        }
        while (loop == 0) {
            System.out.println("Guess the secret meal: ");
            guess = yee.nextLine();
            if (guess.equals(secret)) {
                System.out.println("Correct! You win!");
                loop = 1;
            } else {
                if (guess.equals("shrimp")) {
                    shrimpguess = shrimpguess + 1;
                    if (shrimpguess == 1) {
                        System.out.println("Wrong answer!");
                    } else {
                        System.out.println("You already guessed that! You lose!");
                        loop = 1;
                    }
                } else if (guess.equals("tacos")) {
                    tacosguess = tacosguess + 1;
                    if (tacosguess == 1) {
                        System.out.println("Wrong answer!");
                    } else {
                        System.out.println("You already guessed that! You lose!");
                        loop = 1;
                    }
                } else if (guess.equals("sushi")) {
                    sushiguess = sushiguess + 1;
                    if (sushiguess == 1) {
                        System.out.println("Wrong answer!");
                    } else {
                        System.out.println("You already guessed that! You lose!");
                        loop = 1;
                    }

                } else {
                    System.out.println("That is not one of your choices. You lose!");
                    loop = 1;
                }
            }
        }
    }
}
