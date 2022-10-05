import java.util.ArrayList;

public class Book{
    private String name;
    private ArrayList<String> paragraphs = new ArrayList<String>();
    private ArrayList<String> tables = new ArrayList<String>();
    private ArrayList<String> images = new ArrayList<String>();

    public Book(String name){
        this.name = name;
    }

     public void createNewParagraph(String text){
        this.paragraphs.add(text);
    }

    public void createNewTable(String text){
        this.tables.add(text);
    }

    public void createNewImage(String text){
        this.images.add(text);
    }

    @Override
    public String toString() {
        return "Book" +
                "\nname='" + name + '\'' +
                "\n paragraphs=" + paragraphs +
                "\n tables=" + tables +
                "\n images=" + images;
    }

    public void print(){
        System.out.println(this);
    }
}