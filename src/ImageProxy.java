import java.awt.*;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public Element get(int i) {
        return null;
    }

    public void print() {
        loadImage();
        realImage.print();
    }

    public void accept(Visitor visitor){
        visitor.visitImageProxy(this);
    }

}
