public class Image implements Element{
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int i) {
        return null;
    }

    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }
}
