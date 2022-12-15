import java.util.ArrayList;

public class TableOfContents {
    public ArrayList<String> toc;
    public void print(){
        System.out.println("Table of Contents: ");
        for(String s : toc){
            System.out.println(s);
        }
    }

    public void setToc(ArrayList<String> toc) {
        this.toc = toc;
    }

    public TableOfContents(ArrayList<String> toc) {
        this.toc = toc;
    }
}

