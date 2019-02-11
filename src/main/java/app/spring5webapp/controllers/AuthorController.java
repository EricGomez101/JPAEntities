package app.spring5webapp.controllers;

import app.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController
{
    private AuthorRepository authorRepository;

    AuthorController(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        // adding the list of authors to the model object.
        model.addAttribute("authors", authorRepository.findAll());

        // returns the view name. which can be found within the templates directory.
        return "authors";
    }
}
