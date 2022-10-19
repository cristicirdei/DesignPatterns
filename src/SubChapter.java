import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private ArrayList<Table> tables = new ArrayList<Table>();
    private ArrayList<Image> images = new ArrayList<Image>();


    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        paragraphs.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        images.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        tables.add(new Table(title));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Paragraph p : paragraphs)
            p.print();
        for(Image i : images)
            i.print();
        for(Table t : tables)
            t.print();
    }
}
