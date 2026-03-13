package com.libraryManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager
{
    File bookFile = new File("bookrecords.txt");

    FileManager()
    {

    }

    void writeToFile(ArrayList<Book> books)
    {
        try(FileWriter bookManager = new FileWriter("bookrecords.txt"))
        {
            for(Book t : books)
            {
                bookManager.write("\n" + t.getTitle() + "," + t.getAuthor() + "," + t.getYear() + "," + t.getGenre());
            }
        } catch(IOException e)
        {
            System.out.println("An error has occured");
        }

    }

    ArrayList<String> readFile()
    {
        ArrayList<String> listofBooks = new ArrayList<>();
        try(Scanner readFile = new Scanner(bookFile))
        {
            while(readFile.hasNextLine())
            {

                String contents = readFile.nextLine();
                listofBooks.add(contents);


            }

        } catch(IOException e)
        {
            System.out.println("An error has occured!");
        }
        return listofBooks;
    }



}
