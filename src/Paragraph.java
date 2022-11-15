public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int i) {
        return null;
    }
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

}