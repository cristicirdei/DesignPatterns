public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " + "______" + paragraph.getText());
    }
}
