package gaiduk.controllers;

import gaiduk.domain.Book;
import gaiduk.services.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
/**
 * Created by igaiduk on 6/10/2017.
 */

@Controller
@RequestMapping("/books_list")
public class BooksListController {
    private BooksService booksService;

    public BooksListController(BooksService booksService){this.booksService = booksService;}

    @GetMapping
    public String homePage(Model model){
        List<Book> booksList = booksService.getBooks();
        model.addAttribute("booksList", booksList);
        return "booksList";
    }
}
