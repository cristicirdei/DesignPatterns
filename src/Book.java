import java.util.ArrayList;

public class Book extends Section{
    public ArrayList<Author> authors = new ArrayList<Author>();
    public TableOfContents contents;

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

    public void accept(Visitor visitor){
        visitor.visitBook(this);
        super.accept(visitor);
    }

    public void setContents(TableOfContents contents) {
        this.contents = contents;
    }
}