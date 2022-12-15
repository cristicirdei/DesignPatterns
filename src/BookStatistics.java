public class BookStatistics implements Visitor {
    public void visitBook(Book book){}
    public void visitSection(Section section){}
    public void visitTableOFContents(TableOfContents tableOfContents){}
    public void visitParagraph(Paragraph paragraph){
        s2 += 1;
    }
    public void visitImageProxy(ImageProxy imageProxy){
        s0 += 1;
    }
    public void visitImage(Image image){
        s0 += 1;
    }
    public void visitTable(Table table){
        s1 += 1;
    }

    public int s0, s1, s2;

    public BookStatistics() {
        s0 = 0;
        s1 = 0;
        s2 = 0;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + s0);
        System.out.println("*** Number of tables: " + s1);
        System.out.println("*** Number of paragraphs: " + s2);
    }
}
