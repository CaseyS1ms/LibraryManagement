package com.libraryManagement;


import java.util.ArrayList;
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
        library.loadBooks();
        System.out.println("Welcome to the Library System");
        System.out.println("1. Add Book\n2. Lookup Book\n3. Remove Book\n4. Mark Book as read\n5. List Books");


        int input = scanner.nextInt();
        scanner.nextLine();

        while(!(input == 0)) {


            switch (input) {
                case 1:
                    System.out.println("Adding Book...");
                    addBook();
                    break;
                case 2:
                    System.out.println("Looking up Book...");
                    getBook();
                    break;
                case 3:
                    System.out.println("Removing Book...");
                    removeBook();
                    break;
                case 4:
                    System.out.println("Marking Book as Read...");
                    markRead();
                    break;
                case 5:
                    System.out.println("Listing Books...");
                    listBooks();
                    break;

            }

            System.out.println("Welcome to the Library System");
            System.out.println("1. Add Book\n2. Lookup Book\n3. Remove Book\n4. Mark Book as read\n5. List Books");

            input = scanner.nextInt();
            scanner.nextLine();



        }

    }

    void addBook()
    {
        System.out.println("ADD BOOK MENU\nPlease type in Book Title\nPlease type in the Author\nPlease type in the year\nPlease type in the genre");

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        String genre = scanner.nextLine();


        library.addBook(title,author,year,genre);

    }

    void getBook()
    {
        System.out.println("Please enter book title and year of publish: ");
        String title = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        Book book = library.getBook(title,year);
        if(book != null)
        {
            System.out.println("Title: " + book.getTitle() + " | Author: " + book.getAuthor() + " | Year: " + book.getYear() + " | Genre: " + book.getGenre());
        }
        else
        {
            System.out.println("Error book not found");
        }
    }

    void removeBook()
    {
        System.out.println("Please enter book title and year of publish: ");
        String title = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        library.removeBook(title,year);
        System.out.println("Book Removed");
    }

    void listBooks()
    {
        System.out.println("==========");
        ArrayList<Book> books = library.getList();
        if(books.isEmpty())
        {
            System.out.println("There are no Books!");
        }
        for(Book t : books)
        {

            System.out.println("Book Title: " + t.getTitle() + " | Book Author: " + t.getAuthor() + " | Read: " + t.isRead());
        }
        System.out.println("==========");
    }

    void markRead()
    {
        System.out.println("Please enter book title and year of publish: ");
        String title = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        library.markAsRead(title,year);
    }



}//end of main class
