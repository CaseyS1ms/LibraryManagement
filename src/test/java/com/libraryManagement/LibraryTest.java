package com.libraryManagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setup()
    {
        library = new Library();
    }

    @Test
    void addBook_increasesLibrarySize()
    {
        library.addBook("Dune", "Frank Herbet", Integer.parseInt("1965"), "Sci-Fi");
        assertEquals(1,library.getList().size());
    }

    @Test
    void addBook_storesCorrectTitle()
    {
        library.addBook("Dune", "Frank Herbet", Integer.parseInt("1965"), "Sci-Fi");
        assertEquals("Dune", library.getList().get(0).getTitle());

    }

    @Test
    void removeBook_removesItFromLibrary()
    {
        library.addBook("Dune", "Frank Herbet", Integer.parseInt("1965"), "Sci-Fi");

        library.removeBook("Dune", Integer.parseInt("1965"));

        assertTrue(library.getList().isEmpty());
    }

    @Test
    void removeBook_titleNotInLibrary_leavesLibraryUnchanged()
    {
        library.addBook("Dune", "Frank Herbet", Integer.parseInt("1965"), "Sci-Fi");

        library.removeBook("This is not a real book", Integer.parseInt("1800"));

        assertEquals(1, library.getList().size());
    }

    @Test
    void markRead_changesBookStatus()
    {
        library.addBook("Dune", "Frank Herbet", Integer.parseInt("1965"), "Sci-Fi");
        assertFalse(library.getList().get(0).isRead());

        library.markAsRead("Dune", Integer.parseInt("1965"));
        assertTrue(library.getList().get(0).isRead());
    }

}