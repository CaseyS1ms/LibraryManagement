package com.caseysims;

public class Book
{
    private String title;
    private String author;
    private String genre;
    private int year;

    public Book(String title, String author, int year,String genre)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
}
