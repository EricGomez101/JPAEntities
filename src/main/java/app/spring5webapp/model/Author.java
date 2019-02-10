package app.spring5webapp.model;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author
{
    private String fname;
    private String lname;

    private Set<Book> books = new HashSet<>();

    public Author()
    {

    }

    public Author(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }

    public Author(String fname, String lname, Set<Book> books)
    {
        this.fname = fname;
        this.lname = lname;
        this.books = books;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public Set<Book> getBooks()
    {
        return books;
    }

    public void setBooks(Set<Book> books)
    {
        this.books = books;
    }
}
