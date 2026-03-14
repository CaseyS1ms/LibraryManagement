package com.libraryManagement;

public class Book
{
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean read;

    public Book(String title, String author, int year,String genre, boolean read)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.read = read;
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

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
