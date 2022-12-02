package Q2;

public class book {
    String title;
    double price;
    int publishYear;
    String author;

    public book (String title, int publishYear, String author){
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;
    }

    public book() {
        
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getPublishYear(){
        return publishYear;
    }

    public  String getAuthor(){
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price){
        this.price =  price;
    }

    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}
