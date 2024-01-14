/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.greeting;

/**
 *
 * @author Erika
 */
import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<>();
        // Inputting nicknames
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter nickname of classmate " + (i + 1) + ": ");
            String nickname = scanner.nextLine();
            nicknames.offer(nickname);
    }
        // Greeting and displaying nicknames
        System.out.println("Press H to say Hi to your classmates!");
        while (!nicknames.isEmpty()) {
            System.out.print("Press H: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("H")) {
                String classmate = nicknames.poll();
                System.out.println("Hi " + classmate + "!");
            } else {
                System.out.println("Invalid input. Press H to say Hi.");
            }
        }
        System.out.println("Done saying hi to all classmates!");
    }
}

