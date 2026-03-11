package com.caseysims;

import java.util.ArrayList;
import java.util.Objects;

public class Library
{
    public ArrayList<Book> books = new ArrayList<>();


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
    }

    public void removeBook(String title, int year)
    {
        Book book = getBook(title,year);
        books.remove(book);
    }


}
