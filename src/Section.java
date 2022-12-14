import java.util.ArrayList;

public class Section implements Element {

    private String title;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }
    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public Element get(int i) {
        return elements.get(i);
    }

    public void print() {
        System.out.println(this.title);

        if(this instanceof Book) {
            System.out.println("\nAuthors:");
            for (Author a : ((Book) this).authors)
                a.print();
            System.out.println();
            if(((Book) this).contents != null) {
                ((Book) this).contents.print();
            }
            System.out.println();
        }

        for(Element e : elements)
            e.print();

    }

    public void accept(Visitor visitor){
        visitor.visitSection(this);
        for(Element e : elements)
            e.accept(visitor);
    }

    public String getTitle() {
        return title;
    }
}