package Q2;

public class toString {
    public static void main(String[] args) {
        book Book = new book();
        System.out.println("Name of the book :");
        Book.setTitle("Harry potter");
        System.out.println(Book.getTitle());

        System.out.println("Author of the book : ");
        Book.setAuthor("D.M.John");
        System.out.println(Book.getAuthor());

        System.out.println("Publish Year of the book : ");
        Book.setPublishYear(Integer.parseInt("1997"));
        System.out.println(Book.getPublishYear());

        System.out.println("Price of the book : ");
        Book.setPrice(Double.parseDouble(String.valueOf(2000)));
        System.out.println(Book.getPrice());
    }
}
