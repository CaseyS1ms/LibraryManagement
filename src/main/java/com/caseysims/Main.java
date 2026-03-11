package com.caseysims;


import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();


    static void main()
    {
        Main main = new Main();
        main.mainLoop();
    }

    public void mainLoop()
    {
        System.out.println("Welcome to the Library System");
        System.out.println("1. Add Book\n2. Lookup Book");

        int input = scanner.nextInt();

        switch(input)
        {
            case 1:
                System.out.println("Adding Book");
                break;
            case 2:
                System.out.println("Looking up Book");

        }


    }


}
