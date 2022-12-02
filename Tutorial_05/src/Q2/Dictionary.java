package Q2;

public class Dictionary extends Book{
    private int words;
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }
    public String toString(){
        return "Dictionary{" + "words=" + words + "} " +super.toString();
    }
}
