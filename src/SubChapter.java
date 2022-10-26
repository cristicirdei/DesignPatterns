import java.util.ArrayList;

public class SubChapter{
    private String name;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        elements.add(new Table(title));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Element e : elements)
            e.print();
    }
}
