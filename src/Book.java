import java.util.ArrayList;

<<<<<<< HEAD
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
=======
public class Book{
    private String title;
    private Author author;
    private TableOfContents contents;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        Chapter c = new Chapter(name);
        chapters.add(c);

        return chapters.indexOf(c);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print(){
        System.out.println("Book: " + this.title);
        author.print();
        for(Chapter c : chapters)
            c.print();
>>>>>>> 0e0536d2ef14abb944908969ca946f7484be5dd2
    }

}