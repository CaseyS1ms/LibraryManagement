# Library Management System

a command-line application for managing a personal book collection, written in Java

## Features

- Add books with a title, author, year and genre
- Remove Books
- Lookup Books
- List Books in Library
- Records are saved to text file, so library is kept between sessions

## Project structure

| Class | Responsibility |
|-------|----------------|
| `Book` | Data model for a single book (fields are private, accessed through getters) |
| `Library` | Holds the collection and the logic for adding, removing and updating books |
| `FileManager` | Saves and loads book records from `bookrecords.txt` |
| `Main` | Command-line menu and user input |