public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int i) {
        return null;
    }
    public void print() {
        System.out.println("Table with title: " + this.title);
    }

}