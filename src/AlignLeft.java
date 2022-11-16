public class AlignLeft implements AlignStrategy{
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " + paragraph.getText() + "______");
    }
}
