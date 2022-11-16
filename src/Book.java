import java.util.ArrayList;

public class Book extends Section{
    public ArrayList<Author> authors = new ArrayList<Author>();
    private TableOfContents contents;

    public Book(String title){
        super(title);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        super.add(element);
    }

    public void print(){
        super.print();

    }

}