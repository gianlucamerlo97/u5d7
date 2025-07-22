package gianlucamerlo.u5d7.controllers;

import gianlucamerlo.u5d7.entities.Author;
import gianlucamerlo.u5d7.payloads.NewAuthorPayload;
import gianlucamerlo.u5d7.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AuthorsController {
    @Autowired
    private AuthorsService authorsService;

    @GetMapping
    public List<Author> getAuthors(){
        return this.authorsService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author createAuthor(@RequestBody NewAuthorPayload body){
        return this.authorsService.saveAuthor(body);
    }

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable int authorId){
        return this.authorsService.findById(authorId);
    }

    @PutMapping("/{authorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findAuthorByIdAndUpdate(@PathVariable int authorId){
        this.authorsService.find
    }
}
