import java.util.ArrayList;

public class CreateTOC implements Visitor {
    public void visitBook(Book book){}
    public void visitSection(Section section){
        String st = section.getTitle() + " _____ pg. " + nrPage;
        toc.add(st);
        nrPage += 1;
    }
    public void visitTableOFContents(TableOfContents tableOfContents){}
    public void visitParagraph(Paragraph paragraph){
        nrPage += 1;
    }
    public void visitImageProxy(ImageProxy imageProxy){
        nrPage += 1;
    }
    public void visitImage(Image image){
        nrPage += 1;
    }
    public void visitTable(Table table){
        nrPage += 1;
    }

    public int nrPage;
    public static ArrayList<String> toc = new ArrayList();

    public CreateTOC() {
        nrPage = 1;
    }

    public static void addToc(Book book) {
        book.setContents(new TableOfContents(toc));
    }
}
