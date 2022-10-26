import java.util.ArrayList;

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
    }
}