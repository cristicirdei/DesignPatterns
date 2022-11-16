public class AlignCenter implements AlignStrategy{

    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " + "___" + paragraph.getText() + "___");
    }
}
