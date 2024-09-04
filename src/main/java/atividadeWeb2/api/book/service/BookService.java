package atividadeWeb2.api.book.service;


import atividadeWeb2.api.book.entities.Books;
import atividadeWeb2.api.book.exceptions.ResourceNotFoundException;
import atividadeWeb2.api.book.repository.BookRepository;
import atividadeWeb2.api.book.requests.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Books> getAll() {
        return bookRepository.findAll();
    }

    public Books getById(Long id) throws ResourceNotFoundException {
        Optional<Books> books = bookRepository.findById(id);
        if(books.isEmpty()){
            throw new ResourceNotFoundException("Livro não encontrado");
        }
        return books.get();
    }

    public Books insert(BookRequest bookRequest) {
        Books books = new Books();

        books.setCatogory(bookRequest.getCatogory());
        books.setAutores(bookRequest.getAutores());
        books.setTittle(bookRequest.getTittle());
        books.setSumary(bookRequest.getSumary());
        books.setQtdPages(bookRequest.getQTDPages());

        return bookRepository.save(books);

    }

}
