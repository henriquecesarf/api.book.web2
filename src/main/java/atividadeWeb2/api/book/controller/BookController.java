package atividadeWeb2.api.book.controller;


import atividadeWeb2.api.book.entities.Books;
import atividadeWeb2.api.book.exceptions.ResourceNotFoundException;
import atividadeWeb2.api.book.requests.BookRequest;
import atividadeWeb2.api.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Books>> getAll(){
        return ResponseEntity.ok(bookService.getAll());
    }

    @GetMapping("/{id}")
        public ResponseEntity<Books> getOne(@PathVariable Long id) throws ResourceNotFoundException {
           return ResponseEntity.ok(bookService.getById(id)) ;
    }

    @PostMapping
    public ResponseEntity<Books> insert(@RequestBody BookRequest bookRequest) {
        Books book = bookService.insert(bookRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
}
