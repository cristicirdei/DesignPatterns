public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public String getText() {
        return this.text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int i) {
        return null;
    }
    public void print() {
        if(this.alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println("Paragraph: " + this.text);
        }
    }

    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
}
