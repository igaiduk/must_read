package gaiduk.controllers;

import gaiduk.services.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by igaiduk on 6/10/2017.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    private BooksService booksService;

    public BookController(BooksService booksService){this.booksService = booksService;}

    @GetMapping(value = "/new")
    public String newBook(Model model){
        model.addAttribute("id", "");
        model.addAttribute("author", "");
        model.addAttribute("title", "");
        model.addAttribute("description", "");
        model.addAttribute("yearOfPublishing", "");
        return "book";
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String addBook(@ModelAttribute(value = "author") String author,
                          @ModelAttribute(value = "title") String title,
                          @ModelAttribute(value = "description") String description,
                          @ModelAttribute(value = "yearOfPublishing") String yearOfPublishing
    ){
        booksService.create(author, title, description, yearOfPublishing);
        return "redirect:/books_list";
    }

    @GetMapping(value = "/remove/{id}")
    public String removeBook(Model model, @PathVariable(value = "id") Long bookId){
        booksService.remove(bookId);
        return "redirect:/books_list";
    }
}