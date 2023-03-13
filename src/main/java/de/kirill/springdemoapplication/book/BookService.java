package de.kirill.springdemoapplication.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    Book getBookForId(UUID id) {
        return bookRepository.findById(id).orElse(null);
    }

    List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void initBooks() {
        bookRepository.deleteAll();
        createBook("Philosopher's Stone", "J. K. Rowling");
        createBook("Chamber of Secrets", "J. K. Rowling");
        createBook("Prisoner of Azkaban", "J. K. Rowling");
        createBook("Goblet of Fire", "J. K. Rowling");
    }

    private void createBook(String name, String author) {
        Book book = new Book();
        book.setAuthor(author);
        book.setName(name);
        bookRepository.save(book);
    }
}
