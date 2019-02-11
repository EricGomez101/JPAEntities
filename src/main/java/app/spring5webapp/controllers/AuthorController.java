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

    @RequestMapping
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
