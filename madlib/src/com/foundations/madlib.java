package com.foundations;

import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {
        System.out.println("Madlib by Kavin Jindal");

        String color;
        String celeb;
        String food;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favourite color >> ");
        color = kb.nextLine();

        System.out.println("Enter the name of your fav celeb");
        celeb = kb.nextLine();

        System.out.println("Enter the name of your fav dish");
        food = kb.nextLine();

        System.out.println("==============================");
        System.out.println("Your skin color is " + color);
        System.out.println(celeb + " just killed you");
        System.out.println("You died of food poisoning after you ate " + food);

    }
}
