package com.libraryManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();
    private FileManager bookManagement = new FileManager();


    public Book getBook( String title, int year)
    {
        for(Book t : books)
        {
            if(Objects.equals(t.getTitle(), title))
            {
                if(t.getYear() == year)
                {
                    return t;
                }
            }
        }
        return null;
    }

    public void addBook(String title, String author, int year, String genre)
    {
        Book newBook = new Book(title,author,year,genre);
        books.add(newBook);
        bookManagement.writeToFile(books);
    }

    public void removeBook(String title, int year)
    {
        Book book = getBook(title,year);
        books.remove(book);
        bookManagement.writeToFile(books);
    }

    public ArrayList<Book> getList()
    {
        return books;
    }

    public int statsRead()
    {
        int count = 0;
        for(Book t : books)
        {
            if(t.isRead())
            {
                count++;
            }
        }
        return count;
    }

    public int statsCount()
    {
        return books.size();
    }

    public void loadBooks()
    {
        ArrayList<String> bookList = bookManagement.readFile();
        System.out.println(bookList.size());
        System.out.println(bookList);
        for(String t: bookList)
        {
            String bookStr = t;
            String regex = "[,]";
            String[] myArray = bookStr.split(regex);
            Book loadedBook = new Book(myArray[0], myArray[1], Integer.parseInt(myArray[2]), myArray[3]);
            books.add(loadedBook);
        }


    }

    public void markAsRead(String title, int year)
    {
        for(Book t : books)
        {
            if(Objects.equals(t.getTitle(), title))
            {
                if(t.getYear() == year)
                {
                    t.setRead(true);
                }
            }
        }

    }


}
