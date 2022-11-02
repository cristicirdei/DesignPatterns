import java.util.ArrayList;

public class Section implements Element {

    private String title;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }
    public void add(Element element) {
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
        for(Element e : elements)
            e.print();
    }
}
